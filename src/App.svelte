<script>
  import Header from "./lib/header.svelte";
  import Playlist from "./lib/playlist.svelte";
  import TarjetaDeCancion from "./lib/TarjetaDeCancion.svelte";
  // Para que nos podamos conectar al backend y traer la lista 
  // de canciones, hay que implementar:
  // GET localhost:9000/api/tracks que devuelva un array de objetos como este:^
  //{
  //   title:"Despacito",
  //   author:"Luis Fonsi",
  //   coverImage: "www.covers.com/despacito.png",
  //   genre: "Latin",
  //   releaseYear: 2013
  // }
  var tracks =[{
   Disco:  "ASTRA",
   Author:  "ASIA",
   Title: "Voice of America",
   ReleaseYear: 1985,
   Genre: "Rock progresivo", 
   Link:"https://open.spotify.com/track/1UMPYOmC7xbK24F1KwM5oT",
   Cover:"",
  },
  {
   Disco:  "From Fear to Eternity",
   Author:  "Iron Maiden",
   Title: "El Dorado",
   ReleaseYear: 2011,
   Genre: "Heavy Metal", 
   Link:"https://open.spotify.com/track/24uVC7odXve5T6bmx0qlUW",
   Cover:"",
  },
  {
   Disco:  "Dangerous",
   Author:  "Michael Jackson",
   Title: "Dangerous",
   ReleaseYear: 2011,
   Genre: "Pop", 
   Link:"https://open.spotify.com/track/3u4RKvwDT3CKeYbjxqXEye",
   Cover:"",
  },
  {
   Disco:  "In Utero",
   Author:  "Nirvana",
   Title: "Rape Me",
   ReleaseYear: 1993,
   Genre: "Grunge", 
   Link:"https://open.spotify.com/track/2i5K0EdMY5zFs9t7KfYK3k",
   Cover:"",
  },
  {
   Disco:  "Yellow Submarine",
   Author:  "The Beatles",
   Title: "Yellow Submarine",
   ReleaseYear: 1966,
   Genre: "Rock", 
   Link:"https://open.spotify.com/track/1tdltVUBkiBCW1C3yB4zyD",
   Cover:"",
  },
  {
   Disco:  "1984",
   Author:  "Van Halen",
   Title: "Hot for teacher",
   ReleaseYear: 2015,
   Genre: "Metal", 
   Link:"https://open.spotify.com/track/6QDbGdbJ57Mtkflsg42WV5",
   Cover:"",
  },
  {
   Disco:  "Starboy",
   Author:  "The weeknd",
   Title: "Starboy",
   ReleaseYear: 2016,
   Genre: "Dark pop", 
   Link:"https://open.spotify.com/track/7MXVkk9YMctZqd1Srtv4MB",
   Cover:"",
  }
  
   ]
</script>

<main>
  <Header />
  <Playlist {tracks} />
</main>
