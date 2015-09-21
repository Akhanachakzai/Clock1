package clock;

public class Main {

	public static void main(String[] args) {
		Alarmclock obj = new Alarmclock();
		obj.setAlarm(0, 16);
		for (int x=0;x<=2000;x++){
			obj.tick();
			System.out.println(obj.viewHr()+":"+obj.viewMin());
		}
		// TODO Auto-generated method stub

	}

}
