package clock;

public class Main {

	public static void main(String[] args) {
		Alarmclock obj = new Alarmclock();
		obj.setAlarm(0, 16);
		for (int x=0;x<=1000;x++){
			obj.tick();
			System.out.print(obj.viewHr()+":"+obj.viewMin());
			System.out.print(":"+obj.viewSec());
		}
		// TODO Auto-generated method stub

	}

}
