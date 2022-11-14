package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CandidateRepository;
import kodlama.io.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	
	private CandidateRepository candidateRepository;
	
	@Autowired
	public CandidateManager(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {

		return new SuccessDataResult<List<Candidate>>
		(candidateRepository.findAll(), "İş arayanlar listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateRepository.save(candidate);
		return new SuccessResult("İş arayan eklendi");
	}

	//@Override
	//public DataResult<Candidate> getCandidateById(int userId) {
	//	return new SuccessDataResult<Candidate>
	//	(this.candidateRepository.getCandidateById(userId), "Data listelendi");
	//}

	@Override
	public Result delete(Candidate entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Candidate entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Candidate> getById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
