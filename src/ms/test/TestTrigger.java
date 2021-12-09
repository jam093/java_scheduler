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
						.withIntervalInSeconds(5) //����
						.repeatForever()) //������ �ݺ�
				.build();
		
		//withSchedule()
		// - trigger�� ����� �ϴ� schedule�� �����Ѵ�.
		// - startNow()�� startAt()���� �����ٷ��� �����ð��� ������ �� �ֱ� ������
		//	�ܼ��� ���͹� �����ٷ���� simpleScedule()�� ����ϰ�
		//	Ư�� �����̳� ��¥�� ���� �����Ϸ� �Ѵٸ� cronSchedule�� ����ϴ� ���� ����.
		return trg;
	}
	
}
