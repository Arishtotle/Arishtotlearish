import java.util.*;

public class DividearrayEqual{

public boolean Didivearray(int [] ar){

Arrays.sort(ar);
	 for(int i=0;i<ar.length;i++){
	if(ar[i]==ar[i+1]){
	i++;
	continue;
	}else{
   return false;
}
}
 return true;
}

public static void main(String[] args){
int [] ar={2,3,3,2,2,2};	 
DividearrayEqual da=new DividearrayEqual();

System.out.println(da.Didivearray(ar));
}

}
