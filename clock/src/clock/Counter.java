package clock;

public class Counter {

	      private int count, base;
	      public Counter(int  baseVal)  {
	    	  count = 0;
	    	  base = baseVal;
	       
	      }
	      public void increment( ){
	      count ++;
	      
	      
	      
	      if(count==base)
	      {
	    	  reset();
	      }
	      
	      }
	      public void reset( )  {
	    	  count = 0 ;
	      }
	      public int viewCount( ) {
	    	  return count;
	      }
	}


