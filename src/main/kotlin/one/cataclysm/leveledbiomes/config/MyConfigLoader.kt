package one.cataclysm.leveledbiomes.config

import com.sksamuel.hoplite.ConfigLoaderBuilder
import com.sksamuel.hoplite.addResourceSource

object MyConfigLoader {
    val config: Config = ConfigLoaderBuilder.default().addResourceSource("leveledbiomes.yml").build().loadConfigOrThrow()

    //TODO
    fun reload() {
    }
}