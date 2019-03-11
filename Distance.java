
public class Distance{
	private int feet;
	private double inches;

	public void setDistance(int feet, double inches){
		this.feet=feet;
		this.inches=inches;
	}	
	
	public void displayDistance(){
		System.out.println(feet + " feet and " + inches + " inches" );
	
	}
	public Distance addDistance(Distance d){
		Distance obj3=new Distance();
		obj3.feet=this.feet+d.feet;
		obj3.inches=this.inches+d.inches;
		return obj3;
	}

}	