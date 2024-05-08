import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name");
		
		String name=s.nextLine();
		//step 4 we create a arrayList to store questions with options
		ArrayList<Questions> a=new ArrayList<Questions>();
		a.add(new Questions("Number of primitive data types in Java are ?" , "A.6", "B.4 ", "C.7", "D.8"));
		
		a.add(new Questions("Which of these components are used in a Java program for compilation, debugging, and execution ?","A.JDK","B.JVM","C.JRE","D.JIT"));
		
		a.add(new Questions("What is the size of float and double in java ?","A.32 and 64","B.64 and 32","C.64 and 64","D.32 and 32"));
		
		a.add(new Questions("Automatic type conversion is possible in which of the possible cases ?","A.Byte to int","B.Int to long","C.Long to int","D.Short to int"));
		
		a.add(new Questions("Arrays in java are ?","A.Object reference","B.objects","C.Primitive data type","D.None"));
		
		a.add(new Questions("When is the object created with new keyword?","A.At run time","B.At compile time","C.Depends on code","D.None"));
		
		a.add(new Questions("In which of the following is toString() method defined ?","A.java.lang.object","B.java.lang.String","C.java.lang.util","D.None"));
		
		a.add(new Questions("compareTo() returns ?","A.True","B.False","C.An int Value","D.None"));
		
		a.add(new Questions("Total constructor string class have ?","A.13","B.7","C.3","D.20"));
		
		a.add(new Questions("Identify the return type of a method that does not return any value ?","A.int","B.void","double","C.None"));
		
		
		//step 5 we craete another arrayList to store answers of the questions
		ArrayList<String> ans=new ArrayList<String>();
		ans.add("D");
		ans.add("A");
		ans.add("A");
		ans.add("B");
		ans.add("A");
		ans.add("A");
		ans.add("A");
		ans.add("C");
		ans.add("C");
		ans.add("B");
		
		//step 6 we create a another array list to store the questions which user give wrong answers will show in the last so user can know wich question is wrong.
		ArrayList wrongAnswers=new ArrayList ();
		
		
		//step 7 we create a marks variable to store score
		int marks=0;
		//step 8 we create for loop for questions 
		for(int i=0;i<a.size();i++) {
			System.out.print(i+1+".");
			System.out.println(a.get(i));
			System.out.println();
			System.out.print("Enter your answer : ");
			String str = s.next();
			// step 8 we check if the user input is right or wrong
			if(ans.get(i).equalsIgnoreCase(str)) {
				System.out.println("Correct");
				marks++;
			}
			else{
				System.out.println("Wrong");
				wrongAnswers.add(a.get(i));
			}
		}
		//step 9 total marks user obtain from the quiz with there name.
		System.out.println("Total Marks Of : "+name+" ");
		System.out.println(marks+"/"+a.size());
		System.out.println("Incorrect answers: ");
		//step 10 will show the questions that user give wrong answers
		for(int i=0;i<wrongAnswers.size();i++) {
			System.out.println(wrongAnswers.get(i));
		}
		//step 11 will show the answers of all the questions so user can telly there answers
		System.out.println("This is the answer of All the questions");
		for(int i=0; i<ans.size(); i++)
		{
			System.out.println(i+1+"."+ans.get(i));
		}
		// last step for feed back from the user
		System.out.println("Give you Feedback");
		String feedback = s.next();
		System.out.println("Thanks For Your FeddBack");
		
	}
}
