package kodlama.io.hrms.core.utilities.verifications.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;

public interface SystemEmployeeConfirmationService {

	Result isConfirmedBySystemEmployee(Employer employer);
	
}
