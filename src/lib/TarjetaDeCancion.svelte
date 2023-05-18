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

<style>
    img {
        background-color: red;
        display: flex;
        margin-top: 100px;
        width: 150px;
        height: 150px;
        margin-bottom: 5px;
        border: 1px solid #ff1493;
        box-shadow: 0 0 10px #ff1493;
    }

    img:hover {
        transform: translate(1px, 1px);
    }
</style>
