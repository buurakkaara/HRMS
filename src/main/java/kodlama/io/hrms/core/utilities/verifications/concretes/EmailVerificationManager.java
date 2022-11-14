package kodlama.io.hrms.core.utilities.verifications.concretes;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.core.utilities.verifications.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public Result verifyEmail(String email) {
		
		return new SuccessResult();
	}

}
