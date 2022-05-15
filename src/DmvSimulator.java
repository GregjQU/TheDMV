import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("welcome to the DMV. How may we help you?");
		
		
		///xyz
		
		int[] num = new int[500];		
        int userPlace = new Random().nextInt(num.length);
        System.out.println("Your number is " + userPlace + "! Please wait to be called.");

        countUp(userPlace);
        countDown(userPlace);
      
        if( Math.random() <= 0.75 ) {
            System.out.println("You  have your proper forms. Please proceed to the next line.");
          }
        else
        {
        System.out.println("You don't have the proper papers. Please come back later");

        }
    }

	private static void countDown(int userPlace) {
		// TODO Auto-generated method stub
		
	}

	private static void countUp(int userPlace) {
		// TODO Auto-generated method stub
		
	}
	

}

