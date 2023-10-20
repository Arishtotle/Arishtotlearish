public class Balancesubarraycount{

public static int gcd(int X,int Y){
int res=0;
for(int i=1;i<=Math.min(X,Y);i++){
if(X%i==0 && Y%i==0){
res=i;
}
}
return res;
}
public static void BalanceArray(int[] ar){
   int balance=0;
    for(int i=0;i<ar.length;i++){

      for(int j=i;j<ar.length;j++){
          int lcm=1,sum=0;
         for(int k=i;k<=j;k++){

            sum=sum+ar[k];
            lcm=(lcm*ar[k])/gcd(lcm,ar[k]);
      }
if(sum%2==lcm%2) balance++;
}
}
System.out.println(balance);
}

public static void main(String[] args){
int [] ar={1,2,3};
BalanceArray(ar);
}
}
