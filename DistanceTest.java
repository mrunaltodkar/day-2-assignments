
public class DistanceTest{

	public static void main(String [] args){
		Distance obj1 = new Distance();
		Distance obj2 = new Distance();		

		obj1.setDistance(2,6.4);
		obj1.displayDistance();
		
		obj2.setDistance(3,5.9);
		obj2.displayDistance();
		
		Distance obj4;
		obj4=obj1.addDistance(obj2);
		obj4.displayDistance();
		
	}
}