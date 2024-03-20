class Phone{
    constructor(phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    call(receiver_number){
		document.getElementById("output").innerHTML=`<p>From : ${this.phoneNumber}</p>
	<p>To : ${receiver_number}</p>
		<p>Making the call </p>`;
    }
    message(receiver_number,message){
		document.getElementById("output").innerHTML=`<p>From : ${Sim}</p>
		<p>To : ${to}</p>
		<p>${content}</p>`;
	}
}
class Basic extends Phone{
    constructor(phoneNumber){
        super(phoneNumber);
    }
}
class Smartphone extends Phone{
    constructor(phoneNumber,emailId){
        super(phoneNumber);
        this.emailId=emailId;
    }
    email(to_emailId,subject,body){
       document.getElementById("output").innerHTML=`<p>From : ${this.emailId}</p>
	<p>To : ${to_emailId}</p>
	<p>Subject : ${subject}</p>
	<p>${body}</p>`;
    }
}
class Single extends Basic{
    constructor(phoneNumber){
        super(phoneNumber);
    }
}

class Dual extends Basic{
    constructor(phoneNumber,phone1Number,phone2Number){
        super(phoneNumber);
        this.phone1Number=phone1Number;
        this.phone2Number=phone2Number;
    }
    call(receiver_number,simNumber){
    }
	message(receiver_number,simNumber,message){
    }
}
class IOS extends Smartphone{
    constructor(phoneNumber,emailId,facetimeid){
        super(phoneNumber,emailId);
        this.facetimeid=facetimeid;
    }
    facetime(to_facetimeid){
        document.getElementById("output").innerHTML=`<p>From : ${this.facetimeid}</p>
		<p>To : ${to_facetimeid}</p>
		<p>Making the Face Time</p>`;
    }
}
class Android extends Smartphone{
    constructor(phoneNumber,emailId,duoid){
        super(phoneNumber,emailId);
        this.duoid=duoid;
    }
    duo(to_duoid){
        document.getElementById("output").innerHTML=`<p>From : ${this.duoid}</p>
		<p>To : ${to_duoid}</p>
		<p>Making the Duo</p>`;
    }
}
class WindowsPhone extends Smartphone{
    constructor(phoneNumber,emailId,skypeid){
        super(phoneNumber,emailId);
        this.skypeid=skypeid;
    }

    skype(to_skypeid){
       document.getElementById("output").innerHTML=`<p>From : ${this.skypeid}</p>
	<p>To : ${to_skypeid}</p>
		<p>Making the Skype</p>`;
    }
}		
function displaySmart(){
	var phone=document.getElementById("MobileType").value;
	if(phone=="Smart-Phone"){
	document.getElementById("SmartTypes").style.display="block";
	document.getElementById("fromEmails").style.display="block";
	document.getElementById("call").style.display="block";
	document.getElementById("message").style.display="block";
	document.getElementById("email").style.display="block";
	}else{
		document.getElementById("call").style.display="block";
		document.getElementById("message").style.display="block";
	}
}

function displaySimTow(){
	var sim=document.getElementById("SimType").value;
	if(sim=="Dual"){
	document.getElementById("SimTwos").style.display="block";
	}
}

function DisplaySmartType(){
	var type=document.getElementById("SmartType").value;
	if(type=="IOS"){
		document.getElementById("facetimeids").style.display="block";
		document.getElementById("faceTime").style.display="block";
	}else if(type=="Android"){
		document.getElementById("duoids").style.display="block";
		document.getElementById("Duo").style.display="block";
	}else{
		document.getElementById("skypeids").style.display="block";
		document.getElementById("skype").style.display="block";
	}
}
var instance;
function BaseFormSubmit(){
	var phone=document.getElementById("MobileType").value;
	var phonenumber=document.getElementById("SimOne").value;
	if(phone=="Smart-Phone"){
		var email=document.getElementById("fromEmail").value;
		var type=document.getElementById("SmartType").value;
		if(type=="IOS"){
			var ftID=document.getElementById("facetimeid").value;
			instance=new IOS(phonenumber,email,ftID);
		}else if(type=="Android"){
			var DuoID=document.getElementById("duoid").value;
			instance=new Android(phonenumber,email,DuoID);
		}else{
			var SkypeID=document.getElementById("skypeid").value;
			instance=new WindowsPhone(phonenumber,email,SkypeID);
		}
	}else{
		instance=new Basic(phonenumber);
	}
	BaseTwoDisplay();
	event.preventDefault();
}
function BaseTwoDisplay(){
	document.getElementById("BaseForm").style.display="none";
	document.getElementById("BaseTwo").style.display="block";
}


function call(){
	hide();
	document.getElementById("CallFun").style.display="block";
}
function message(){
	hide();
	document.getElementById("MessageFun").style.display="block";
}
function email(){
	hide();
	document.getElementById("EmailFun").style.display="block";
}
function facetime(){
	hide();
	document.getElementById("FacetimeFun").style.display="block";
}
function duo(){
	hide();
	document.getElementById("DuoFun").style.display="block";
}
function skype(){
	hide();
	document.getElementById("SkypeFun").style.display="block";
}
function hide(){
	document.getElementById("BaseTwo").style.display="none";
}
function showFun(){
	document.getElementById("output").style.display="block";
}


function callFunction(){
	var to =document.getElementById("Tocall").value;
	document.getElementById("CallFun").style.display="none";
	showFun();
	instance.call(to);
}
function messageFunction(){
	var to =document.getElementById("Tomessage").value;
	var content=document.getElementById("ToContent").value;
	document.getElementById("MessageFun").style.display="none";
	showFun();
	instance.message(to,content);
}	
function emailFunction(){
	var to =document.getElementById("toEmail").value;
	var subject=document.getElementById("subject").value;
	var content=document.getElementById("ContentEmail").value;
	document.getElementById("EmailFun").style.display="none";
	showFun();
	instance.email(to,subject,content);
}
function facetimeFunction(){
	var to =document.getElementById("toFaceTime").value;
	document.getElementById("FacetimeFun").style.display="none";
	showFun();
	instance.facetime(to);
}
function duoFunction(){
	var to =document.getElementById("toDuo").value;
	document.getElementById("DuoFun").style.display="none";
	showFun();
	instance.duo(to);
}
function skypeFunction(){
	var to =document.getElementById("toSkype").value;	
	document.getElementById("SkypeFun").style.display="none";
	showFun();
	instance.skype(to);
}
