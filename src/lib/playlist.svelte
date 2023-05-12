<script>
    import TarjetaDeCancion from "./TarjetaDeCancion.svelte";

    export let tracks;
</script>

<div class="contenedor">
    {#each tracks as cancion}
        <TarjetaDeCancion info={cancion} />
    {/each}
</div>

<style>
    div {
        border: 1px solid red;
    }

    .contenedor {
        padding: 3%;
        display: flex;
    }
</style>
