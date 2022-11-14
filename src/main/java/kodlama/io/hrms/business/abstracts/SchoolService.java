package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.business.BaseService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.School;

public interface SchoolService extends BaseService<School>{

	DataResult<List<School>> getAll();
	Result add(School school);
	DataResult<List<School>> getAllSortedByResume_IdOrderByGraduateYear(int resumeId);
	
	DataResult<List<School>> getAllByResume_Candidate_Id(int candidateId);
}
