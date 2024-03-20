function stringExpand(){
	console.log("String Expansion"+"\n");
	var input="b1c6d19";
	var ch=input.split("");
	var count=0;
	var output="";
	while(count<ch.length){
		var print="";
		var number=0;
		if(ch[count]>"0" && ch[count]<="9"){
			print=ch[count-1];
			number=ch[count]-"0";
			if(ch[count+1]>="0" &&ch[count+1]<="9"){
				number*=10;
				number+=ch[count+1]-"0";
				count++;
			}
			count++;
		}
		for(i=0;i<number;i++){
			output+=print;
		}
		count++;
	}
	console.log(output);
}
stringExpand();

function stringPattern(){
	console.log("\n"+"String Pattern"+"\n");
	var input="1234567";
	var ch=input.split("");
	var i=0,j=ch.length-1;
	while(i<=ch.length/2){
		var output="";
		var space="";
		for(k=0;k<=i;k++){
			space+=" ";
		}
		output=space+ch[i]+space;
		if(i!=j){
			output+=ch[j];
		}
		console.log(output);
		if(i==j){
			break;
		}
		i++,j--;
	}
	i--,j++;
	while(i>=0){
		var output="";
		var space="";
		for(k=0;k<=i;k++){
			space+=" ";
		}
		output=space+ch[i]+space;
		if(i!=j){
		output+=ch[j];
		}
		i--,j++;
		console.log(output);
	}
}
stringPattern();