package ms.test;

import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

public class TestTrigger {
	public Trigger getTrigger() {
		Trigger trg = TriggerBuilder.newTrigger()
				.withIdentity("TestTrigger", "TestGroup")
				.startNow()
				.withSchedule(
						SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(5) //간격
						.repeatForever()) //영원히 반복
				.build();
		
		//withSchedule()
		// - trigger가 따라야 하는 schedule을 정의한다.
		// - startNow()나 startAt()으로 스케줄러의 구동시간을 조정할 수 있기 때문에
		//	단순한 인터벌 스케줄러라면 simpleScedule()을 사용하고
		//	특정 요일이나 날짜에 따라 구동하려 한다면 cronSchedule을 사용하는 것이 좋다.
		return trg;
	}
	
}
