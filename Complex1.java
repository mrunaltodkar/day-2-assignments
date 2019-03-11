public class Complex1{
	public static void main(String [] args){
		Complex object1 = new Complex();
		object1.complexSet(2,3);
		object1.complexDisplay();
		Complex object2 = new Complex();
		object2.complexSet(4,5);
		object2.complexDisplay();
	 
		Complex object3;
		object3=object1.complexSum(object2);
		object3.complexDisplay();

}
}