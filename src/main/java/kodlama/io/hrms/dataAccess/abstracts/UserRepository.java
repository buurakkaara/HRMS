package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.User;

public interface UserRepository extends JpaRepository<User, String>{

	User getById(int id);
	
}
