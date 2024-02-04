package week2.day1;

public class Mobile {

	
		private static final boolean True = false;

		public void makeCall()
		{
			String mobileModel = "Nokia";
			float mobileWeight = 10.5f;
			System.out.println("Mobile Model: "+mobileModel);
			System.out.println("Mobile Weight: "+mobileWeight);
			return;
	}
		public void sendMsg()
		{
			boolean isFullCharged = True;
			int mobileCost = 5000;
			System.out.println("Mobile Fully-Charged: "+isFullCharged);
			System.out.println("Mobile Cost: "+mobileCost);
			return;
		}
		
		public static void main(String[] args) {
			Mobile obj=new Mobile(); //created an object called "obj" for class Mobile to call from main method. 	
			obj.makeCall();
			obj.sendMsg();
			System.out.println("This is my mobile");
	}}