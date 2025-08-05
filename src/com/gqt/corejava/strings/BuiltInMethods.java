package com.gqt.corejava.strings;

public class BuiltInMethods {

	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		//1.length()
		int len=str.length();//it will  provide the total length of the string
		System.out.println("the length of the String is="+len);

		//2.charAt()
		char c=str.charAt(0);// ti will provide the character at the specified position
		System.out.println("the String at specified position is="+c);
		
		//3.concat()
		String str1=str.concat("is the best batsman in the world");//it merges the content of 2 strings
		System.out.println(str1);
		
		//4.contains()
		boolean res1=str.contains("Ramesh");//it will check if substring is present in the mainstring or not
		System.out.println(str1);
		res1=str.contains("uamesh");//it will check if substring is present in the mainstring or not
		
		//5.endwith()
		boolean res2=str.endsWith("tendulkar");//it will check if substring present at the end of the mainstring or not
		System.out.println(res2);
		res2=str.endsWith("pendulkar");//it will check if substring present at the end of the mainstring or not 
		System.out.println(res2);
		
		//6.startsWith()
		boolean res3=str.startsWith("Sachin");//it will if the substring present at the start of the mainstring or not
		System.out.println(res3);
		res3=str.startsWith("pachin");//it will if the substring present at the start of the mainstring or not
		System.out.println(res3);
		
		//7.getclass()
		Class Class1=str.getClass();
		System.out.println(Class1);
		
		//8.hashcode()
		int hashcode=str.hashCode();
		System.out.println(hashcode);
		
		//9.index()
		int index1=str.indexOf('s');
		System.out.println(index1);
		index1=str.indexOf('Z');
		System.out.println(index1);
		
		//10.isBlank()
		boolean res4=str.isBlank();
		String str3="         ";
		res4=str3.isBlank();
		System.out.println(res4);
		String str4="         ";
		res4=str3.isBlank();
		System.out.println(res4);
		
		//11.isEmpty()
		boolean res5=str.isEmpty();
		System.out.println(res5);
		res5=str3.isEmpty();
		System.out.println(res5);
		res4=str.isEmpty();
		System.out.println(res5);
		
		//12.lastIndexof()
		int lastIndex=str.lastIndexOf('e');
		System.out.println(lastIndex);
		lastIndex=str.lastIndexOf('Z');
		System.out.println(lastIndex);
		
		//13.replace()
		String replace=str.replace('s','*');
		System.out.println(replace);
		
		//14.subString(int start)
		String subString=str.substring(6);
		System.out.println(subString);
		
		//15.subString(int start, int end)
		subString=str.substring(6,13);
		System.out.println(subString);
		
		//16.toLowerCase()
		String lowercase=str.toLowerCase();
		System.out.println(lowercase);
		
		//17.touppercase()
		String touppercase=str.toUpperCase();
		System.out.println(touppercase);
	}
}
		
		







		





		
		








	
