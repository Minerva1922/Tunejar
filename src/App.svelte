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
   Title: "",
   ReleaseYear: 1985,
   Genre: "Rock progresivo", 
   Link:"https://open.spotify.com/track/1UMPYOmC7xbK24F1KwM5oT",
   Cover:"https://i.scdn.co/image/ab67616d0000b2731f7c4da2d7c136970044523e",
  },
  {
   Disco:  "From Fear to Eternity",
   Author:  "Iron Maiden",
   Title: "El Dorado",
   ReleaseYear: 2011,
   Genre: "Heavy Metal", 
   Link:"https://open.spotify.com/track/24uVC7odXve5T6bmx0qlUW",
   Cover:"https://m.media-amazon.com/images/I/91ToMjRTEmL._SL1500_.jpg",
  }
   ]
</script>


<main>
  <Header />
  <Playlist {tracks} />
  
</main>