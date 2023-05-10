<script>
  import Header from "./lib/header.svelte";
  import Playlist from "./lib/playlist.svelte";
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
    title:"Despacito",
    author:"Luis Fonsi",
    coverImage: "www.covers.com/despacito.png",
    genre: "Latin",
    releaseYear: 2013
  }]
</script>

<main>
  <Header />
  <Playlist tracks={tracks} />
</main>