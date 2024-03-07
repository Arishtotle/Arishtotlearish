window.addEventListener('scroll', function() {
	var element = document.querySelector('.screenContent');
	var position = element.getBoundingClientRect();
	
	if(position.top <= -1000) {
		document.querySelector(".topIcon").style.display="block";
	}
	if(position.top>=-1000){
		document.querySelector(".topIcon").style.display="none";
	}
});

/*function showPopUp(){
	document.querySelector(".whatsNextPOPUP").style.display="block";
}
	
function hidePopUp(){
	document.querySelector(".whatsNextPOPUP").style.display="none";
}*/