package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.School;

public interface SchoolRepository extends JpaRepository<School, Integer>{

	List<School> getAllByResume_Candidate_Id(int candidateId);

}
