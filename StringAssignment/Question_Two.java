package com.yash.StringAssignment;
//2)WAP to print the all alphabets of string in ascending and descending order.
public class Question_Two {

	public static void main(String[] args) {       

		
		 String Name = "ShaaanTanuuu";
		 char a[] = Name.toCharArray();
		 System.out.println("The String characters in ascending orders are =");
		 for (int i = 0; i < a.length; i++) {
			 for (int j = i + 1; j < a.length; j++) {
				 if (a[i] > a[j]) {
					 char temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
			 System.out.print(a[i] + " ");
		 }
			 System.out.println(" ");
			 System.out.println("The String characters in descending orders are =");
			 for (int i = 0; i < a.length; i++) {
				 for (int j = i + 1; j < a.length; j++) {
					 if (a[i] < a[j]) {
						 char temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
				 }
				 System.out.print(a[i] + " ");
			 }
			 

}
}
