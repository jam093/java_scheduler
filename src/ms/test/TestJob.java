package ms.test;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TestJob implements Job{
	//�����ٸ��� ���� �۾��� ������ ��ü
	public TestJob() {
		System.err.println("This is TestJob");
	}
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		//job�� ����κ�
		//jobDetail �ν��Ͻ��� scheduler�� ���� ����Ǹ� �Ѿ����
		//������ �Ϸ�Ǹ� trigger�� �Ѿ��.
		System.err.println("This is TestJob execute");
	}
	
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
