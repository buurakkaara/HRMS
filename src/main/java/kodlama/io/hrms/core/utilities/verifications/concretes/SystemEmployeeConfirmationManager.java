package kodlama.io.hrms.core.utilities.verifications.concretes;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.core.utilities.verifications.abstracts.SystemEmployeeConfirmationService;
import kodlama.io.hrms.entities.concretes.Employer;

public class SystemEmployeeConfirmationManager implements SystemEmployeeConfirmationService{

	@Override
	public Result isConfirmedBySystemEmployee(Employer employer) {
		return new SuccessResult();
	}

}
