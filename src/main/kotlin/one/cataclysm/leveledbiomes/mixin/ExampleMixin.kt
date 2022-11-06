package one.cataclysm.leveledbiomes.mixin

import one.cataclysm.leveledbiomes.LOGGER
import net.minecraft.client.gui.screen.TitleScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(TitleScreen::class)
@Suppress("unused")
class ExampleMixin {
    @Inject(at = [At("HEAD")], method = ["init()V"])
    private fun init(info: CallbackInfo) {
        LOGGER.info("This line is printed by an example mod mixin!")
    }
}