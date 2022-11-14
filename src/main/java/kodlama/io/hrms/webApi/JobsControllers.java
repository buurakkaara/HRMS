package kodlama.io.hrms.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Job;

@RequestMapping("/api/jobs")
@RestController
public class JobsControllers {

	private JobService jobService;

	@Autowired
	public JobsControllers(JobService jobTitleService) {
		super();
		this.jobService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		
		return this.jobService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
	
	@GetMapping("/getByTitle")
	public DataResult<Job> getByTitle(@RequestParam String title){
		return this.jobService.getByTitle(title);
	}
	
}
