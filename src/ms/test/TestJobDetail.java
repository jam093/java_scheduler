package ms.test;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class TestJobDetail {
	public JobDetail getJob() {
		//JobBuilder의 newJob은 정적메소드이기 때문에 객체생성 없이 바로 사용한다.
		JobDetail job = JobBuilder.newJob(TestJob.class)
				.withIdentity("TestJob","TestGroup")
				.withDescription("simple TesetJob")
				.usingJobData("num",0)
				.build();
		
		//withIndentity(name,group)
		// - job의 이름과 group명을 짓는다. group은 중복될 수 없고, name은 group내에서 중복되면 안된다.
		//withDescription(String)
		// - job의 설명
		//usingJobData(key,value)
		// - job에 넘겨줄 data로 key는 String만, value는 원시타입을 입력한다.
		//build()
		// - 앞에서 설정한 정보들을 jobDetail로 반환한다.
		return job;
	}
}
