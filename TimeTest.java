
public class TimeTest{
	
	public static void main(String [] args){
		Time obj1 = new Time();
		Time obj2 = new Time();

		obj1.setTime(12,45);
		obj1.displayTime();

		obj2.setTime(16,60);
		obj2.displayTime();

		Time obj4;
		obj4= obj1.sumTime(obj2);
		obj4.displayTime();
	}

}