public class FrogJumps{

public static boolean frog(int[] stones,int end,int start,int k){

if(start==end) return true;


boolean has = false;
for(int i=0;i<stones.length;i++) if(stones[i]==start) has = true;
if(has==false) return false;


boolean b1=false,b2=false,b3=false;

if(start != start+k-1)b1=frog(stones, end, start+k-1,k-1);
if(start != start+k+1)b2=frog(stones, end, start+k+1,k+1);
if(start != start+k)b3=frog(stones, end, start+k,k);


return b1 || b2 || b3;
}
	public static void main(String[] args){

		int[] stones={0,1,2,4,8};
		int end=stones[stones.length-1];
		int start=stones[0];		
		System.out.println(frog(stones,end,start,0));
	}
}
