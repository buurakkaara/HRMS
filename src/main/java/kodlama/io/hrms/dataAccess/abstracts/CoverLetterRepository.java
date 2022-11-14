package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.CoverLetter;

public interface CoverLetterRepository extends JpaRepository<CoverLetter, Integer>{

	List<CoverLetter> getAllByResume_Candidate_Id(int candidateId);
	
}
