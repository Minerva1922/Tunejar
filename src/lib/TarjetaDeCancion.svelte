<script>
    import { each } from "svelte/internal";
    import Corazon from "./corazon.svelte";
    export let info;
</script>

<div class="card" style="background-image: url({info.cover})">
    <div class="info">
        <h3>{info.title}</h3>
        <p>{info.author} ({info.releaseYear})</p>
    </div>
    <Corazon/>
</div>

<style>
    .card {
        background-size: cover;
        background-repeat: no-repeat;
        position: relative;
        width: 200px;
        height: 200px;
        margin: 10%;
        border-radius: 5px;
    }

    .info {
        margin: 5%;
        display: flex;

        text-align: center;
        flex-direction: column;
        color: black;
        background-color: rgba(255, 255, 255, 0.669);
        visibility: hidden;
    }

    .card:hover .info{
        visibility: visible;
    }

</style>
