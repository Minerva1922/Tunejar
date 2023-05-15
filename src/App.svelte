<script>
    import { onMount } from "svelte";
  import Header from "./lib/header.svelte";
  import Playlist from "./lib/playlist.svelte";

  let tracks = [ ];

  onMount(() => {
    fetch("http://localhost:9000/api/songs")
      .then( respuesta => respuesta.json())
      .then( datos => tracks = datos)
  })
</script>

<main>
  <Header />
  <Playlist {tracks} />
</main>

<style>
  /*main {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    width: 100%;
    height: 100%;
  }*/
</style>
