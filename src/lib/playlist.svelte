<script>
    import TarjetaDeCancion from "./TarjetaDeCancion.svelte";

    export let tracks;
</script>
<div>
    {#each tracks as cancion}
         <TarjetaDeCancion info={cancion}/>
    {/each}
</div>
