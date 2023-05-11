<script>
    export let info;
</script>

<img src={info.Cover} alt="cover" />
<p>{info.Title} by {info.Author} ({info.ReleaseYear})</p>


<style>
    img{
        width: 300px;
        display: flex;
        justify-content: center;
        margin-left: 600px;
        border-radius: 20%;
        margin-top: 60px;
    }

    p{
        color:white;
    }
</style>