package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.LanguageService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.LanguageRepository;
import kodlama.io.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>
		(this.languageRepository.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Language language) {
		this.languageRepository.save(language);
		return new SuccessResult("Dil eklendi");
	}

	@Override
	public DataResult<List<Language>> getAllByResume_Candidate_Id(int candidateId) {
		return new SuccessDataResult<List<Language>>
		(this.languageRepository.getAllByResume_Candidate_Id(candidateId), "Data listelendi");
	}

}
