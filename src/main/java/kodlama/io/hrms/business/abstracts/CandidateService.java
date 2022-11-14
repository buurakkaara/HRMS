package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.business.BaseService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Candidate;

public interface CandidateService extends BaseService<Candidate> {

	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);

	DataResult<Candidate> getById(int userId);
}
