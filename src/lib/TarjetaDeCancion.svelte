<script>
    export let info;
    let hover = false;
</script>

<div class="card">
    <img src={info.Cover} alt="cover" />`
    <div class="info">
        <p>{info.Title}</p>
        <p>{info.Author} ({info.ReleaseYear})</p>
    </div>
</div>

<style>
    .card {
        border: 1px solid blue;
        display: grid; /*ni idea de por que**/
        position: inline;
    }
    img {
        width: 200px;
        border-radius: 20%;
        
    }
    .info {
        color: white;
        position: absolute;
        text-align: center;
        display: none;
    }
    .card:hover .info {
        display: inline;
    }
</style>
