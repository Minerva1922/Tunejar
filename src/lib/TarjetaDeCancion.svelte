<script>
    import { each } from "svelte/internal";

    export let info;
    
</script>


<div class="card-grid">
    
    
    <div class="info">
        <img src={info.cover} alt="cover" />
        <h3>{info.title}</h3>
        <p>{info.author} ({info.releaseYear})</p>
    
    </div>
   
</div>

<style>
    .card-grid {
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        gap: 20px;
        margin-top: 20px;
        
       /* border-width: 10px;
        border-style: solid;
        border-image: linear-gradient(to right, #f1f7f1, #ff00ff) 1;
        display: flex;
        position: top;*/
        
    }
    img {
        object-fit: cover;
        width: 80%;
        height: 250px;
        margin-bottom: 10px;
        border-radius: 20px;
        border: 2px solid #FF1493;
        box-shadow: 0 0 10px #FF1493, 0 0 20px #FF1493, 0 0 30px #FF1493, 0 0 40px #FF1493;
        
        
    }
    .info {
        color: white;
        position: relative;
        text-align: center;
        
    }
    
    

    .info h3{
        top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: #642245;
  border: 2px solid #FF1493;
  box-shadow: 0 0 10px #FF1493, 0 0 20px #FF1493, 0 0 30px #FF1493, 0 0 40px #FF1493;
  color: white;
  padding: 5px;
  border-radius: 10px;
  opacity: 0;
  transition: opacity 0.3s ease;
  width: 80%;
  text-align: center;
}

.info p{
    top: 70%;
    left: 50%;
  transform: translate(-50%, -50%);
  background-color: #642245;
  border: 2px solid #FF1493;
  box-shadow: 0 0 10px #FF1493, 0 0 20px #FF1493, 0 0 30px #FF1493, 0 0 40px #FF1493;
  color: white;
  padding: 5px;
  border-radius: 10px;
  opacity: 0;
  transition: opacity 0.3s ease;
  width: 80%;
  text-align: center;
}

p:hover{
    opacity: 1;
}

h3:hover{
    opacity: 1;
}
</style>
