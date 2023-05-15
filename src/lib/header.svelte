<script>
    import logo from "../assets/tunejar-logo.png";
</script>

<header>
 <div class= "navbar">
   <img src= {logo} alt="logo de tunejar"> 
   <button class="login">
   <svg xmlns="http://www.w3.org/2000/svg" width="52" height="52" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
    <path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
  </svg>
    </button>
 </div>
</header>

<style>
    
    .navbar{
       
        height: 90px;
        display: flex;
        width: 100%;
        justify-content: space-between;
       
       
    }
    img {
        height: 100%;
    }

    .login{
        display: flex;
        width: 55px;
        height: 55px;
        color: black;
        background-color: pink;
        border-radius: 80px;
        margin-top: 1px;
        margin-left: 400px;
    }

    

    

</style>
