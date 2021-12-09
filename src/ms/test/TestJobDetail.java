package ms.test;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class TestJobDetail {
	public JobDetail getJob() {
		//JobBuilder�� newJob�� �����޼ҵ��̱� ������ ��ü���� ���� �ٷ� ����Ѵ�.
		JobDetail job = JobBuilder.newJob(TestJob.class)
				.withIdentity("TestJob","TestGroup")
				.withDescription("simple TesetJob")
				.usingJobData("num",0)
				.build();
		
		//withIndentity(name,group)
		// - job�� �̸��� group���� ���´�. group�� �ߺ��� �� ����, name�� group������ �ߺ��Ǹ� �ȵȴ�.
		//withDescription(String)
		// - job�� ����
		//usingJobData(key,value)
		// - job�� �Ѱ��� data�� key�� String��, value�� ����Ÿ���� �Է��Ѵ�.
		//build()
		// - �տ��� ������ �������� jobDetail�� ��ȯ�Ѵ�.
		return job;
	}
}
