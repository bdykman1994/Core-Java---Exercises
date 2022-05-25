
    var videos = ["https://www.youtube.com/embed/xEEpu_SVbAE", "https://www.youtube.com/embed/KeY1T_1tKtU", "https://www.youtube.com/embed/uIauXFVABIQ", 
    "https://www.youtube.com/embed/90xhor9jkiQ","https://www.youtube.com/embed/s-09gNDsPzQ","https://www.youtube.com/embed/QUj9B4Y3LqI", "https://www.youtube.com/embed/X2zLpB8Cfi0",
    "https://www.youtube.com/embed/2VuuVULLiuY", "https://www.youtube.com/embed/vKvosQcfh8U"];
    window.onload = function () {
        var playerDiv = document.getElementById("random_player");
        var player = document.createElement("IFRAME");
        var randomVideoUrl = videos[Math.floor(Math.random() * videos.length)];
        player.setAttribute('width', '500');
        player.setAttribute('height', '400');
        player.setAttribute('src', randomVideoUrl);
        player.setAttribute('hidden', true);
        player.setAttribute('id', 'anime_player');
        playerDiv.appendChild(player);
    }

// youtube API used to embed youtTube video iFrame in HTML
var tag = document.createElement('script');
var firstScriptTag = document.getElementsByTagName('script')[0];
firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

var player;

function onPlayerReady(event) {
    event.target.playVideo();
  }

  var done = false;
  function onPlayerStateChange(event) {
    if (event.data == YT.PlayerState.PLAYING && !done) {
      setTimeout(stopVideo, 6000);
      done = true;
    }
  }
  function stopVideo() {
    player.stopVideo();
  }
  
  

  // else if function to make iframe visible and hidden
  function toShow() {
  let vis = document.getElementById("anime_player")
    if (vis.hidden == true){
      vis.hidden = false
    } else if (vis.hidden == false) {
      vis.hidden = true
    }
    }
