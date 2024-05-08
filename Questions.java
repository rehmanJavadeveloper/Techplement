//step 1 we create 5  String one for questions and 4 for options
public class Questions {
	 String question;
	 String option1;
	 String option2;
	 String option3;
	 String option4;
	
	
	//step 2 we create constructor 
	
	public Questions(String question,String option1,String option2,String option3,String option4)
	{
		this.question=question;
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.option4=option4;
		
		
	}
	//step 3 we create  toString method. if we override toString method it will get data of the object instead of getting address of that object
	

	@Override
	public String toString() {
		System.out.println(question);
		System.out.println(option1);
		System.out.println(option2);
		System.out.println(option3);
		System.out.print(option4);
		
		return "";
	}
}
