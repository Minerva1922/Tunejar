<script>
    import {each} from "svelte/internal";

    export let info;
</script>

<div class="card">
    <img src={info.cover} alt="cover"/>
    <div class="info">
        <h3>{info.title}</h3>
        <p>{info.author} ({info.releaseYear})</p>
    </div>
</div>

<style>
    .card {
        position: relative;
    }
    img {
        position: relative;
        display: flex;
        width: 250px;
        height: 250px;
        margin: 2%;
        object-fit: contain;
        box-shadow: 0 0 10px #ff1493;
    }

    img:hover {
        transform: translate(1px, 1px);
    }

    .info {
        bottom: 0;
        margin: 5%;
        display: flex;
        position: absolute;
        text-align: center;
        flex-direction: column;
        color: black;
        background-color: rgba(255, 255, 255, 0.3);

    }


    /*.info h3,*/
    /*.info p {*/
    /*    top: 50%;*/
    /*    left: 50%;*/
    /*    transform: translate(-50%, -50%);*/
    /*    background-color: #642245;*/
    /*    border: 2px solid #ff1493;*/
    /*    box-shadow: 0 0 10px #ff1493, 0 0 20px #ff1493, 0 0 30px #ff1493,*/
    /*    0 0 40px #ff1493;*/
    /*    color: white;*/
    /*    padding: 10px;*/
    /*    border-radius: 20px;*/
    /*    opacity: 0;*/
    /*    transition: opacity 0.3s ease;*/
    /*    text-align: center;*/

    /*}*/

    /*.info p:hover,*/
    /*.info h3:hover {*/
    /*    opacity: 1;*/
    /*}*/

</style>
