<script>
    export let info;
    let hover = false;
</script>


<div class="card">
    <img src={info.Cover} alt="cover" />
    <div class="info">
        <p>{info.Title}</p>
        <p>{info.Author} ({info.ReleaseYear})</p>
    </div>
</div>

<style>
    .card {
        
        border-width: 10px;
  border-style: solid;
  border-image: linear-gradient(to right, #00ff00, #ff00ff) 1;
  padding: px; 
        display: flex;
        position:top;
        
    }
    img {
        width: 140px;
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
