public class MirrorPairs{
public static void main(String[] args){

int[] arA={57,13,96};
int[] arB={75,31,69};
for(int i=0;i<arA.length;i++){
for(int j=0;j<arB.length;j++){

while(arA[i]>0){
int rev=arA[i]%10;
int rec=rec*10+rev;
