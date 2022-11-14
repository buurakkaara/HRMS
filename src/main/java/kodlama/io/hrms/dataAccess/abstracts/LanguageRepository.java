package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{

	List<Language> getAllByResume_Candidate_Id(int candidateId);

	
}
