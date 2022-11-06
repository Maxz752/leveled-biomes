package one.cataclysm.leveledbiomes.config

import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addResourceSource

class ConfigurationLoader {
    val config = ConfigLoaderBuilder.default().addResourceSource("leveledbiomes.yml").build().loadConfigOrThrow<ModConfig>()
    fun load() {
    }
}