import java.util.*;
import java.io.*;

public class NumAndStrArraySort {
	public static void main(String[] args) {
		int[] num= {1,4,5,6,3,2};
		String[] str= {"arish","totle","code","get"};
		Arrays.toString(num);
		Arrays.toString(str);
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));
		
		Arrays.sort(num);
		Arrays.sort(str);
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));
		
	}

}
