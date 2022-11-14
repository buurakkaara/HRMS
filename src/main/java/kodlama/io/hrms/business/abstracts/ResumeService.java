package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.business.BaseService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Resume;
import kodlama.io.hrms.entities.dtos.ResumeDto;

public interface ResumeService extends BaseService<Resume> {

	//DataResult<List<Resume>> getAll();
	//Result add(Resume resume);
	
	DataResult<Resume> getById(int resumeId);
	
	DataResult<ResumeDto> getResumeWithDetailsByCandidateId(int candidateId);
	
	//DataResult<List<ResumeWithDetailsDto>> getResumeWithAllDetails();

	
}
