<script>
    export let tracks;
</script>
<div>
    {#each tracks as track}
         <playlist info = {track}/>
    {/each}

</div>