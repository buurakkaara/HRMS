package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.business.BaseService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService extends BaseService<CoverLetter>{

	DataResult<List<CoverLetter>> getAllByResume_Candidate_Id(int candidateId);
	
}
