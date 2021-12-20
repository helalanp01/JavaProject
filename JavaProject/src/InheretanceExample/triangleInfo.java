package InheretanceExample;

import java.util.Scanner;

public class triangleInfo {
	//public static void main(String args[]) {
		// TODO Auto-generated method stub

	
//int height,width;
//int result =height*width;
	public int result;
	public void resultTriangle() {
		Scanner scan=new Scanner(System.in);
		int height=scan.nextInt();
		int width=scan.nextInt();
		 result=height*width;
		 System.out.println(result);
	}
	public void paralle() {
		int parallelogram=result/2;
		System.out.println(parallelogram);
	}

 
}
