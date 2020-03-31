package basicjava;

public class Android {
	
	String modelName = "Iphone";
	int mYear = 2020;
	boolean isAndroid = true;
	float mbWeight = 1.5f;
	long imeNumber = 1236548798;

	public static void main(String[] args) {
		

		Android newAndroid = new Android();
		String phoneModel = newAndroid.modelName;
		int serialNumber = newAndroid.mYear;
		boolean osStatus = newAndroid.isAndroid;
		float mobileWeight = newAndroid.mbWeight;
		long mbIMENumber = newAndroid.imeNumber;
		
		System.out.println(phoneModel);
		System.out.println(serialNumber);
		System.out.println(osStatus);
		System.out.println(mobileWeight);
		System.out.println(mbIMENumber);
	}

}