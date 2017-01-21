function initializeFireBase(){
    // Initialize Firebase
  var config = {
    apiKey: "AIzaSyC_YB9YzVwp4Mcr9YoestGdvxeR3TjhFw4",
    authDomain: "myapp-2cd98.firebaseapp.com",
    databaseURL: "https://myapp-2cd98.firebaseio.com",
    storageBucket: "myapp-2cd98.appspot.com",
    messagingSenderId: "384779119154"
  };
  firebase.initializeApp(config);
}

function doLogin(){
var dbref = firebase.auth();
var userid =document.getElementById("userid").value;
var pwd = document.getElementById("pwd").value;
var promise  = dbref.signInWithEmailAndPassword(userid,pwd);
    promise.then(function(){
       location.href="welcome.html";
        // console.log("Login SucessFully....");
    });
    promise.catch(function(error){
        document.getElementById("showerror").innerHTML="Invalid Userid or Password";
        //console.log("LOgin Error...");
    })
    
    
}



function doRegister(){
    var dbref = firebase.auth();
var userid =document.getElementById("userid").value;
var pwd = document.getElementById("pwd").value;
var promise  = dbref.createUserWithEmailAndPassword(userid,pwd);
    promise.then(function(){
        console.log("Register SucessFully....");
    });
    promise.catch(function(error){
        document.getElementById("showerror").innerHTML="Unable to Register User...";
        //console.log("Register Error...");
    })
    
}

function checkUserIsLoggedIn(){
    firebase.auth().onAuthStateChange(function(userObject){
        if(userObject){
            document.getElementById("userid").value=userObject.email;
        }
        else{
            location.href="index.html";
        }
    })
}

function doLogOut(){
    firebase.auth().signOut();
    console.log("U Log Out SuccessFully....");
}

