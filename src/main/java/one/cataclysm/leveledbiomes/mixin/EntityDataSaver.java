package one.cataclysm.leveledbiomes.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import one.cataclysm.leveledbiomes.util.IMyEntityDataSaver;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityDataSaver implements IMyEntityDataSaver {
    private static final String IMY_NBT_KEY = "leveled-biomes-data";
    private NbtCompound persistentData;

    @Override
    public @NotNull NbtCompound getPersistentData() {
        if (persistentData == null) persistentData = new NbtCompound();
        return persistentData;
    }

    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable<?> info) {
        if (persistentData != null) {
            nbt.put(IMY_NBT_KEY, persistentData);
        }
    }

    @Inject(method = "readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info) {
        if (nbt.contains(IMY_NBT_KEY, 10)) {
            persistentData = nbt.getCompound(IMY_NBT_KEY);
        }
    }
}