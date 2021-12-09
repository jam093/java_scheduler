package ms.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class TestScheduler {
	public static void main(String[] args) {
		//scheduler의 인스턴스화, Job을 등록하고 실행 또는 중지한다.
		try {
			SchedulerFactory sf = new StdSchedulerFactory();
			Scheduler sc = sf.getScheduler();
			
			sc.scheduleJob(
					new TestJob().getJob(), new TestTrigger().getTrigger());
			sc.start();
			
			Thread.sleep(60000);
			sc.shutdown();
		} catch (Exception e) {
			System.out.println("schedule error");
		}
	}
}
