<script>
    import Corazon from "./corazon.svelte";
    export let info;
</script>

<div class="card" style="background-image: url({info.cover})">
    <div class="info">
        <h3>{info.title}</h3>
        <p>{info.author} ({info.releaseYear})</p>
    </div>
    <Corazon id={info.id} like={info.favorite}/>
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
        box-shadow: 0 0 10px #ff1493, 0 0 20px #ff1493;
        
    }

    .info {
        margin: 20%;
        display: flex;
        color: #ff1493;
        -webkit-text-stroke: 1px black;
        text-align: center;
        flex-direction: column;
        box-shadow: 0 0 10px #14efff, 0 0 20px #14efff, 0 0 30px #14efff, 0 0 40px #14efff;
        background-color: rgba(255, 255, 255, 0.672);
        visibility: hidden;
        
    }

    .card:hover .info{
        visibility: visible;
    }

</style>
