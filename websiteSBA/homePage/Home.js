
// this is to get day of the week and time
let date = new Date();
let today = date.getDay();
let minutes = String(date.getMinutes()).padStart(2, "0");
let hours = date.getHours() 

// date.getDay() dispays in a number so this switch statement is used to get the name of the day
switch (true) {
  case today == 0:
    today = "Sunday";
    break;
 
    case today == 1:
    today = "Monday";
    break;
 
    case today == 2:
    today = "Tuesday";
    break;
  case today == 3:
    today = "Wednesday";
    break;

  case today == 4:
    today = "Thursday";
    break;

  case today == 5:
    today = "Friday";
    break;

  case today == 6:
    today = "Saturday";
    break;
}

// uses to convert a 24 hour clock to a 12 hour clock
if(hours > 12){
     hours = hours - 12
} else {
    hours
}





let clock = document.getElementById("clock");
clock.innerHTML = (today + ", " + hours + ":" + minutes);

//once submit button is pressed the form is removed and message about your car's exteded warranty is displayed
function warrenty(){
let info = document.getElementById("userinfo") 
let button = document.getElementById("buserinfo")
button.remove();
info.remove();

let h = document.createElement("h1")
let t = document.createTextNode("We've been trying to reach you concerning your vehicle's extended warranty. You should've received a notice in the mail about your car's extended warranty eligibility. Since we've not gotten a response, we're giving you a final courtesy call before we close out your file. Press 2 to be removed and placed on our do-not-call list. To speak to someone about possibly extending or reinstating your vehicle's warranty, press 1 to speak with a warranty specialist.")
h.appendChild(t);
document.body.appendChild(h)
}