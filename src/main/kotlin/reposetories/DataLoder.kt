package com.example.tunejarbackend.reposetories

import jakarta.annotation.PostConstruct
import reposetories.Music
import reposetories.MusicRepository
import org.springframework.stereotype.Component

@Component
class DataLoader(private val musicRepository: MusicRepository) {
    @PostConstruct
    fun load() {
        val music = listOf(
            Music("Astra", "voice of america", "https://open.spotify.com/track/1UMPYOmC7xbK24F1KwM5oT", "Asia", 1985, "Rock progrisivo"),
            Music("From Fear To Eternity", "El dorado", "https://open.spotify.com/track/24uVC7odXve5T6bmx0qlUW", "Iron Maiden", 2011, "Heavy Metal"),
            Music("Dangerous", "Dangerous"," https://open.spotify.com/track/3u4RKvwDT3CKeYbjxqXEye", "Michael Jackson", 1991, "Pop"),
            Music("In Utero", "Rape Me", "https://open.spotify.com/track/2i5K0EdMY5zFs9t7KfYK3k", "Nirvana", 1993, "Pop"),
            Music("Tatoo You", "Black Limousine","https://open.spotify.com/track/0xoYN2alNDaN0RuM8mjUqy", "Rollong Stones", 2009, "Rock"),
            Music("Yellow Submarine", "Yellow Submarine", "https://open.spotify.com/track/1tdltVUBkiBCW1C3yB4zyD", "The Beatles", 1966, "Rock"),
            Music("1984", "Hot for teacher", "https://open.spotify.com/track/6QDbGdbJ57Mtkflsg42WV5", "Van Halen", 2015, "Metal"),
            Music("Starboy", "Starboy", "https://open.spotify.com/track/7MXVkk9YMctZqd1Srtv4MB", "The weekend", 2016, "Dark Pop"),

        )

        musicRepository.saveAll(music)
        println("Cargamos datos de prueba cuando arrancamos el servidor: $music")
    }
}
