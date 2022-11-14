package kodlama.io.hrms.core.utilities.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.utilities.adapters.abstracts.MernisCheckService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Candidate;

@Service
public class MernisCheckManager implements MernisCheckService {

	@Override
	public Result checkIfRealPerson(Candidate candidate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
