<script>
    export let tracks;
</script>
<div>
    {#each tracks as track}
         <TarjetaDeCancion info={track}/>
    {/each}
</div>