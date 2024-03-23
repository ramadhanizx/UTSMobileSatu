fun main() {
    val daftarKlub = listOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 6, 3, 1),
        Club("Chelsea", 6, 6, 5, 2, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0),
    )

    // Urutkan klub berdasarkan total trofi, dari terbanyak ke terbanyak
    val daftarKlubTerurut = sortByTotalTrofi(daftarKlub) { it.totalTrofi }

    // Cetak daftar klub yang sudah diurutkan
    println("Daftar Klub Diurutkan berdasarkan Total Trofi:")
    println(daftarKlubTerurut.joinToString("\n\n"))

    // Filter klub yang belum pernah memenangkan Liga Champions dan Liga Europa
    val daftarKlubTanpaJuaraEropa = filterKlubTanpaJuaraEropa(daftarKlub)

    // Cetak daftar klub yang belum pernah memenangkan Liga Champions dan Liga Europa
    println("\nDaftar Klub yang Belum Pernah Memenangkan Liga Champions dan Liga Europa:")
    println(daftarKlubTanpaJuaraEropa.joinToString("\n\n"))
}

// Fungsi untuk mengurutkan daftar klub berdasarkan total trofi
fun sortByTotalTrofi(daftarKlub: List<Club>, f: (Club) -> Int): List<Club> {
    return daftarKlub.sortedByDescending(f)
}

// Fungsi untuk memfilter klub yang belum pernah memenangkan Liga Champions dan Liga Europa
fun filterKlubTanpaJuaraEropa(daftarKlub: List<Club>): List<Club> {
    return daftarKlub.filter { it.championsLeague == 0 && it.europaLeague == 0 }
}

// Fungsi ekstensi untuk menampilkan ringkasan koleksi trofi klub
fun Club.ringkasanTrofi(): String {
    return """
        $nama memenangkan:
            - $ligaSatu trofi Liga Satu
            - $fa trofi FA
            - $efl trofi EFL
            - $championsLeague trofi Liga Champions
            - $europaLeague trofi Liga Europa
    """.trimIndent()
}
