import java.util.*;

public class TelevisionClient{
	
	public static void main(String [] args){
		Television object1 = new Television();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give any input to your TV? then press true or false. ");
		object1.state(sc.nextBoolean());
		
		System.out.println("How much volume you want");
		object1.changeVolume(sc.nextInt());

		System.out.println("Which channel do you want to see");
		object1.changeChannel(sc.nextInt());

		object1.displayStatus();

	}
}