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
    
    .contenedor {
        border: 1px solid red;
        display: flex;
        justify-content: space-between;
        margin-top: 120px;
        column-gap: 10px;
         }

    
</style>
