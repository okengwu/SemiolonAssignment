public class ThisKey {

	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(15,30,19);
		System.out.println(time.buildString());

	}

}
	
	class SimpleTime {
		private int hour;
		private int minute;
		private int second;
		
	
	
	public SimpleTime(int hour, int minute, int second) {
		
		this.hour =hour;
		this.minute= minute;
		this.second= second;
	}	
	
	public String buildString() {
		return String.format( "%24s: %s\n%24s: %s",
			"this.toUniversalString()",this.toUniversalString() ,
		 "toUniversalString()", toUniversalString());
	}

	private String toUniversalString() {
		// TODO Auto-generated method stub
	return String.format("%02:%02d: %02", this.hour,this.minute,this.second);
	}
	
	
	
	
	}