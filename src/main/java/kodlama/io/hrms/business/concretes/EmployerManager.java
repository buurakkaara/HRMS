package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerRepository;
import kodlama.io.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerRepository employerRepository;
	
	@Autowired
	public EmployerManager(EmployerRepository employerRepository) {
		super();
		this.employerRepository = employerRepository;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerRepository.findAll(), "İşverenler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerRepository.save(employer);
		return new SuccessResult("İşveren eklendi");
	}

}
