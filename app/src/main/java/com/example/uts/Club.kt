data class Club(
    val nama: String,
    val ligaSatu: Int,
    val fa: Int,
    val efl: Int,
    val championsLeague: Int,
    val europaLeague: Int
) {
    val totalTrofi: Int
        get() = ligaSatu + fa + efl + championsLeague + europaLeague

    override fun toString(): String {
        return """
            $nama:
                - Liga Satu: $ligaSatu
                - FA: $fa
                - EFL: $efl
                - Champions League: $championsLeague
                - Europa League: $europaLeague
            Total Trofi: $totalTrofi
        """.trimIndent()
    }
}
