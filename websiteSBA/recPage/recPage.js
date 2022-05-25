function thankYou(){
    let info = document.getElementById("recomendations") 
    let button = document.getElementById("buserinfo")
    let rec = document.getElementById("rec")
    rec.remove();
    button.remove();
    info.remove();
  

    let h = document.createElement("h1")
    let t = document.createTextNode("Thank you!")
    h.appendChild(t);
    document.body.appendChild(h)
}