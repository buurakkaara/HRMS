package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SystemEmployeeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.SystemEmployeeRepository;
import kodlama.io.hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService{

	private SystemEmployeeRepository systemEmployeeRepository;
	
	@Autowired
	public SystemEmployeeManager(SystemEmployeeRepository systemEmployeeRepository) {
		super();
		this.systemEmployeeRepository = systemEmployeeRepository;
	}

	@Override
	public DataResult<List<SystemEmployee>> getAll() {

		return new SuccessDataResult<List<SystemEmployee>>
		(this.systemEmployeeRepository.findAll(), "Sistem çalışanları listelendi");
	}

	@Override
	public Result add(SystemEmployee systemEmployee) {
		this.systemEmployeeRepository.save(systemEmployee);
		return new SuccessResult("Sistem çalışanı eklendi");
	}
	

	
}
