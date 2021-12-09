package ms.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class TestScheduler {
	public static void main(String[] args) {
		//scheduler�� �ν��Ͻ�ȭ, Job�� ����ϰ� ���� �Ǵ� �����Ѵ�.
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
