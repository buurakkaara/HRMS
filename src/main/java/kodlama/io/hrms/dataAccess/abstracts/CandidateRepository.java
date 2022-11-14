package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.hrms.entities.concretes.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

	@Query("from Candidate c where c.id=:userId")
	Candidate getCandidateById(int userId);
	
}
