<script>
    import TarjetaDeCancion from "./TarjetaDeCancion.svelte";

    export let tracks;
</script>

<div class="contenedor">
    {#each tracks as cancion}
        <TarjetaDeCancion info={cancion}/>
    {/each}
</div>

<style>
    .contenedor {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        margin: 3%;
    }
</style>
