
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Started Java Basics");  //To Print Out Put
		
		// Add two number 2,3
		int a=2;
		int b=3;
		int sum = a + b ;
		
		System.out.println(sum);  //no need to double quotes treat as variable
   //sum is 5
		
		System.out.println("sum is" + sum);  //use concatanate operator + 
		
		System.out.println("I have Navigated To Home Page");
		
		Methods m = new Methods();
		
		//classobject.methodname    -Calling other calss
		
		//System.out.println(m.ValidateHeader());
		m.ValidateHeader();
		
		//ClassB cb =new ClassB
		//cb.footervalidation();   //create another class and access it
		
		m.ValidateHeader1();
		System.out.println(m.ValidateHeader1());
		System.out.println(m.ValidateHeader2());
		
	}

}
