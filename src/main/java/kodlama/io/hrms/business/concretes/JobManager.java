package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobRepository;
import kodlama.io.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobRepository jobRepository;

	@Autowired
	public JobManager(JobRepository jobRepository) {
		super();
		this.jobRepository = jobRepository;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>
		(this.jobRepository.findAll(), "Mevcut iş ilanları listelendi");
		
	}

	@Override
	public Result add(Job job) {
		this.jobRepository.save(job);
		return new SuccessResult("İş eklendi");
	}

	@Override
	public DataResult<Job> getByTitle(String title) {
		return new SuccessDataResult<Job>
		(this.jobRepository.getByTitle(title), "Data listelendi");
	}

	
	
	
}
