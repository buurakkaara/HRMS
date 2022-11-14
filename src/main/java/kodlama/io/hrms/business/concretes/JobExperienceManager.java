package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobExperienceService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobExperienceRepository;
import kodlama.io.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceRepository jobExperienceRepository;
	
	@Autowired
	public JobExperienceManager(JobExperienceRepository jobExperienceRepository) {
		super();
		this.jobExperienceRepository = jobExperienceRepository;
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceRepository.findAll(), "Data listelendi");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceRepository.save(jobExperience);
		return new SuccessResult("Tecrübe eklendi");
	}

	@Override
	public DataResult<List<JobExperience>> getAllSortedByResume_IdOrderByEndYear(int resumeId) {
		Sort sort = Sort.by(Sort.Direction.DESC,"endYear");
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceRepository.findAll(sort),"Başarılı");
	}

	@Override
	public DataResult<List<JobExperience>> getAllByResume_Candidate_Id(int candidateId) {
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceRepository.getAllByResume_Candidate_Id(candidateId), "Data listelendi");
	}

}
