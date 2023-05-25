enum class DangerLevel(val crisis: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel() = crisis

}

