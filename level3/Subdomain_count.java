import java.util.*;

public class Subdomain_count{

public static void main(String[] args){

String str="9001 discuss.ashwin.com";

HashMap<String,Integer> mp=new HashMap<>();

String[] words=str.split(" ");
int ar=Integer.parseInt(words[0]);

String[] domain=words[1].split("\\.");
for(int j=0;j<domain.length;j++){
if(mp.get(domain[j])==null){
mp.put(domain[j],ar);
}else{
mp.put(domain[j],mp.get(domain[j])+ar);
}
}
System.out.println(mp);
}
}
