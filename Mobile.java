package week1.day1;

public class Mobile {
	public void makeCall() {
	System.out.println("Make a call");
	String mobileModel= "samsung 1";
	System.out.println(mobileModel);
	float mobileWeight= 100.5f;
	System.out.println(mobileWeight);
	}
	public void sendMsg() {
		System.out.println("Send a Msg");
		boolean Fullcharged= true;
		System.out.println(Fullcharged);
		int mobilecost= 17000;
		System.out.println(mobilecost);
		
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my Mobile");
		// TODO Auto-generated method stub

	}

}
