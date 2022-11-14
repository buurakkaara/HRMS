package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.UserRepository;
import kodlama.io.hrms.entities.concretes.User;


@Service
public class UserManager implements UserService {

	
	private UserRepository userRepository;
	
	@Autowired
	public UserManager(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>
		(this.userRepository.findAll(), "Kullanıcılar listelendi");
		
	}


	@Override
	public Result add(User user) {
		this.userRepository.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}



}
