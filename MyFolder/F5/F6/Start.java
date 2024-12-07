package MyFolder.F5.F6;

import MyFolder.F1.*;
import MyFolder.F1.F3.*;
import MyFolder.F2.*;
import MyFolder.F2.F4.*;

public class Start{
     public static void main(String [] args){
		 
		 MyFolder.F1.MyClassA F1A = new MyFolder.F1.MyClassA();
		 F1A.show();
		 MyFolder.F1.MyClassB F1B=new MyFolder.F1.MyClassB();
		 F1B.show();
		 MyFolder.F1.F3.MyClassA F1F3A = new MyFolder.F1.F3.MyClassA();
		 F1F3A.show();
		 MyFolder.F1.F3.MyClassB F1F3B = new MyFolder.F1.F3.MyClassB();
		 F1F3B.show();
		 MyFolder.F2.MyClassA F2A=new MyFolder.F2.MyClassA();
		 F2A.show();
		 MyFolder.F2.MyClassB F2B=new MyFolder.F2.MyClassB();
		 F2B.show();
		 MyFolder.F2.F4.MyClassA F2F4A=new MyFolder.F2.F4.MyClassA();
		 F2F4A.show();
		 MyFolder.F2.F4.MyClassB F2F4B=new MyFolder.F2.F4.MyClassB();
		 F2F4B.show();
		
	 }
}