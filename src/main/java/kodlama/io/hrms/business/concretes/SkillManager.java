package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SkillService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.SkillRepository;
import kodlama.io.hrms.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService{

	private SkillRepository skillRepository;
	
	@Autowired
	public SkillManager(SkillRepository skillRepository) {
		super();
		this.skillRepository = skillRepository;
	}

	@Override
	public DataResult<List<Skill>> getAllByResume_Candidate_Id(int candidateId) {
		return new SuccessDataResult<List<Skill>>
		(this.skillRepository.getAllByResume_Candidate_Id(candidateId), "Data listelendi");	}

}
