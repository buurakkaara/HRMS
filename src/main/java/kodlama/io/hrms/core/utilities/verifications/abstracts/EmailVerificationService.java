package kodlama.io.hrms.core.utilities.verifications.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;

public interface EmailVerificationService {

	public Result verifyEmail(String email);
	
}
