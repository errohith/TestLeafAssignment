package basicjava;

public class Mobile {
	
	String Name = "Rohith";
	int number = 962961766;
	boolean mobileOn = true;
	
	public static void main(String[] args) {
		

		Mobile mobilenew = new Mobile();
		boolean mobilestatus = mobilenew.mobileOn;
		System.out.println(mobilestatus);
		String nameofperson = mobilenew.Name;
		System.out.println(nameofperson);
		int number_1 = mobilenew.number;
		System.out.println(number_1);
	}

}