	function chessboard(){
		var inputvalue=document.getElementById("n").value;
		var chessboard=document.getElementById("chessboard");
		
		for(i=0;i<inputvalue;i++){
			
			var output=document.createElement("div");
				output.classList.add("parent");
				
			for(j=0;j<inputvalue;j++){
				
				var addHere=document.createElement("div");
					addHere.classList.add("square");
					
				if((i+j)%2===0){
					addHere.classList.add("white");
				}else{
					addHere.classList.add("black");	
				}
				
				output.appendChild(addHere);
			}
			chessboard.appendChild(output);
		}
	}