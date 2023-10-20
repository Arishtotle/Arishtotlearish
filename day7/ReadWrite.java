import java.io.*;

public class ReadWrite{
public static void main(String[] args){

File f=new File ("C:\\Users\\Administrator\\Desktop\\FileHandling\\Day7\\ReadWrite.txt");
try{
f.createNewFile();
}catch(Exception i){}
try{

FileReader reader = new FileReader(f);
int ch;
while((ch=reader.read())!=-1){
System.out.print((char) ch);
}
//reader.close();
}catch(Exception e){
//e.printStackTrace();
}

}
}