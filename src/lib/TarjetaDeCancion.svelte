<script>
    import { each } from "svelte/internal";

    export let info;
</script>

<div class="card">
    <div class="info">
        <img src={info.cover} alt="cover" />
        <h3>{info.title}</h3>
        <p>{info.author} ({info.releaseYear})</p>
    </div>
</div>


