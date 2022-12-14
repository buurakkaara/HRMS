package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Skill;

public interface SkillService {

	DataResult<List<Skill>> getAllByResume_Candidate_Id(int candidateId);
	
}
