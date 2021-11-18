package timer;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
		
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int timeChker = 0;
			
			@Override
			public void run() {
				
				if(timeChker < 5) {
					System.out.println("Hello Timer");
					timeChker++;
				}
				else {
					timer.cancel();
				}
			}
		};
		
		timer.schedule(task, 1000, 3000);
	}
}
