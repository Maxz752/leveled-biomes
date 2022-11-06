package one.cataclysm.leveledbiomes

import one.cataclysm.leveledbiomes.config.MyConfigLoader
import org.slf4j.Logger
import org.slf4j.LoggerFactory

private const val MOD_ID = "leveledbiomes"

@JvmField
val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

@Suppress("unused")
fun onInitialize() {
    MyConfigLoader
}