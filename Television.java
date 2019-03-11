
public class Television{
	boolean stateOfTelevision;
	int volume;
	int channel;
	
	public void state(boolean stateOfTelevision){
		
		this.stateOfTelevision=stateOfTelevision;
		if(stateOfTelevision==true)
			System.out.println("Tv is on!");
		else 
			System.out.println("Sorry your TV is off");
			System.exit(0);
	}

	public int changeVolume(int volume){
		this.volume=volume;
		return volume;
	}

	public int changeChannel(int channel){
		this.channel=channel;
		return channel;
	}
	
	public void displayStatus(){
		if(stateOfTelevision==true){
			System.out.println("Status:ON");
		}
		else{
		System.out.println("Status:OFF");
		}
		
		System.out.println("Volume" + volume);
		System.out.println("Channel" + channel);
	}
}