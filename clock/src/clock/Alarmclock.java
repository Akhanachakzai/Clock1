package clock;

	public class Alarmclock extends Clock {
	      private boolean alarmOn;
	      private int hrSet, minSet;
	      public Alarmclock( ) {alarmOn = false;}  	  
	      public void setAlarm(int hr, int min) {
		hrSet = hr; 
		minSet = min; 
		alarmOn = true;
	     }
	      public void tick( ) {
		super.tick( );
		if (alarmOn==true && (viewHr( ) == hrSet) && (viewMin() == minSet) && alarmOn){
			System.out.println("ring, ring, ring");
	      }}
	      public void resetAlarm( )
	      {
	    	  alarmOn = false;
	    	  }
	}	     


