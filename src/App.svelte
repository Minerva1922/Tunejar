<script>
  import { onMount } from "svelte";
  import Header from "./lib/header.svelte";
  import Playlist from "./lib/playlist.svelte";

  let tracks = [];

  onMount(() => {
    fetch("http://localhost:9000/api/songs")
      .then((respuesta) => respuesta.json())
      .then((datos) => (tracks = datos));
  });
</script>

<main>
  <Header />
  <Playlist {tracks} />
</main>

<style>
  main {
    max-width: 90%;
  }
</style>
