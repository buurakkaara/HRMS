package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Skill;

public interface SkillRepository extends JpaRepository<Skill,Integer> {

	List<Skill> getAllByResume_Candidate_Id(int candidateId);
	
}
