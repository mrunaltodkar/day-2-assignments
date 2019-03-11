public class Time{
	
	private int hours;	
	private int minutes;
	
	public void setTime(int hours, int minutes){
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public void displayTime(){
		System.out.println("Time in hour and minutes is " + hours + ":" + minutes);
	}

	public Time sumTime(Time t){
		Time obj3 = new Time();
		obj3.hours = this.hours + t.hours;
		obj3.minutes = this.minutes + t.minutes;
		if(obj3.minutes>60){
			obj3.minutes=obj3.minutes-60;
			obj3.hours+=1;
		}
		return obj3;
	}
}