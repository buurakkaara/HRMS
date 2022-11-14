package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CoverLetterService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CoverLetterRepository;
import kodlama.io.hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{

	private CoverLetterRepository coverLetterRepository;
	
	@Autowired
	public CoverLetterManager(CoverLetterRepository coverLetterRepository) {
		super();
		this.coverLetterRepository = coverLetterRepository;
	}

	@Override
	public DataResult<List<CoverLetter>> getAllByResume_Candidate_Id(int candidateId) {
		return new SuccessDataResult<List<CoverLetter>>
		(this.coverLetterRepository.getAllByResume_Candidate_Id(candidateId), "Data listelendi");
	}

	@Override
	public Result add(CoverLetter entity) {
		coverLetterRepository.save(entity);
		return new SuccessResult("on yazi eklendi!");
	}

	@Override
	public Result delete(CoverLetter entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CoverLetter entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>
		(this.coverLetterRepository.findAll(), "Data listelendi");
	}

}
