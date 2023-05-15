<script>
  import Header from "./lib/header.svelte";
  import Playlist from "./lib/playlist.svelte";
  //import {onMount} from "svelte";

  let tracks = [
    {
      Disc: "ASTRA",
      Author: "ASIA",
      Title: "Voice of America",
      ReleaseYear: 1985,
      Genre: "Rock progresivo",
      Cover: "https://i.scdn.co/image/ab67616d0000b2731f7c4da2d7c136970044523e",
    },
    {
      Disc: "From Fear to Eternity",
      Author: "Iron Maiden",
      Title: "El Dorado",
      ReleaseYear: 2011,
      Genre: "Heavy Metal",
      Cover: "https://m.media-amazon.com/images/I/91ToMjRTEmL._SL1500_.jpg",
    },
    {
  Disc:"Dangerous",
  Author:"Michael Jackson",
  Title:"Dangerous",
  ReleaseYear:1991,
  Genre:"Pop",
  Link:"https://open.spotify.com/track/3u4RKvwDT3CKeYbjxqXEye",
  Cover:"https://i1.wp.com/www.audiograma.com.br/wp-content/uploads/2019/06/michaeljackson-dangerous-cover.jpg?fit=1500%2C1000"
},
{
  Disc:"In Utero",
  Author:"Nirvana",
  Title:"Rape Me",
  ReleaseYear:1993,
  Genre:"Grunge",
  Link:"https://open.spotify.com/track/2i5K0EdMY5zFs9t7KfYK3k",
  Cover:"https://images.genius.com/8d86b37becd527f7ab8d8fc7de94ce25.1000x1000x1.jpg" 
},
{
Disc:"Yellow submarine",
Author:"The Beatles",
Title:"Yellow Submarine",
ReleaseYear:1966,
Genre:"Rock",
Link:"https://open.spotify.com/track/1tdltVUBkiBCW1C3yB4zyD",
Cover:"https://2.bp.blogspot.com/-EVBA4xZ7wUo/VKAByMPWbvI/AAAAAAAAPOA/uZQ5uRWXsx8/s1600/yelsub_lp.jpg"
},
{
Disc:"1984",
Author:"Van Halen",
Title:"Hot for teacher",
ReleaseYear:2015,
Genre:"Metal",
Link:"https://open.spotify.com/track/6QDbGdbJ57Mtkflsg42WV5",
Cover:"https://th.bing.com/th/id/OIP.uVNWvEK7KgKruAuxhuhSXQHaHa?pid=ImgDet&rs=1"
},
{
Disc:"Starboy",
Author:"The weeknd",
Title:"Starboy",
ReleaseYear:2016,
Genre:"Dark Pop",
Link:"https://open.spotify.com/track/7MXVkk9YMctZqd1Srtv4MB",
Cover:"https://static.toiimg.com/thumb/msid-55727891,width-800,height-600,resizemode-75,imgsize-63735,pt-32,y_pad-40/55727891.jpg"
}



  ];

  // onMount(() => {
  //   fetch("http://localhost:9000/api/songs")
  //     .then( respuesta => respuesta.json())
  //     .then( datos => songs = datos)
  //})
</script>

<main>
  <Header />
  <Playlist {tracks} />
</main>

<style>
  main {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    width: 100%;
    height: 100%;
  }
</style>
