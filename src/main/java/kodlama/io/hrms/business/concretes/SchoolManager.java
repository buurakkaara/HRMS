package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.SchoolService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.SchoolRepository;
import kodlama.io.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{

	private SchoolRepository schoolRepository;
	
	@Autowired
	public SchoolManager(SchoolRepository schoolRepository) {
		super();
		this.schoolRepository = schoolRepository;
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>
		(this.schoolRepository.findAll(),"Data listelendi");
	}

	@Override
	public Result add(School school) {
		this.schoolRepository.save(school);
		return new SuccessResult("Okul eklendi");
	}

	@Override
	public DataResult<List<School>> getAllSortedByResume_IdOrderByGraduateYear(int resumeId) {
		Sort sort = Sort.by(Sort.Direction.DESC,"graduateYear");
		return new SuccessDataResult<List<School>>
		(this.schoolRepository.findAll(sort),"Başarılı");
	}

	@Override
	public Result delete(School entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(School entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<School>> getAllByResume_Candidate_Id(int candidateId) {
		return new SuccessDataResult<List<School>>
		(this.schoolRepository.getAllByResume_Candidate_Id(candidateId), "Data listelendi");
	}

}
