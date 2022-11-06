package one.cataclysm.leveledbiomes.config

data class Config(
    val multipliers: Multipliers,
    val features: Features
)

data class Multipliers(
    val biomesDifficultyMultipliers: Map<String, Float>,
    val healthMultiplier: Float,
    val damageMultiplier: Float,
    val speedPerEntityMultipliers: Map<String, Float>
)

data class Features(
    val perEntityRandomDifficulty: Boolean,
    val randomnessRange: Int
)