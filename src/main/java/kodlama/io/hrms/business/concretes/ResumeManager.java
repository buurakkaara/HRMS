package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.business.abstracts.CoverLetterService;
import kodlama.io.hrms.business.abstracts.JobExperienceService;
import kodlama.io.hrms.business.abstracts.LanguageService;
import kodlama.io.hrms.business.abstracts.ResumeService;
import kodlama.io.hrms.business.abstracts.SchoolService;
import kodlama.io.hrms.business.abstracts.SkillService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.ResumeRepository;
import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.Resume;
import kodlama.io.hrms.entities.dtos.ResumeDto;

@Service
public class ResumeManager implements ResumeService{

	CandidateService candidateService;
	ResumeRepository resumeRepository;
	SchoolService schoolService;
	JobExperienceService jobExperienceService;
	LanguageService languageService;
	SkillService skillService;
	CoverLetterService coverLetterService;
	

	
	@Autowired
	public ResumeManager(CandidateService candidateService, ResumeRepository resumeRepository,
			SchoolService schoolService, JobExperienceService jobExperienceService, LanguageService languageService,
			SkillService skillService, CoverLetterService coverLetterService) {
		super();
		this.candidateService = candidateService;
		this.resumeRepository = resumeRepository;
		this.schoolService = schoolService;
		this.jobExperienceService = jobExperienceService;
		this.languageService = languageService;
		this.skillService = skillService;
		this.coverLetterService = coverLetterService;
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>
		(this.resumeRepository.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Resume entity) {
		this.resumeRepository.save(entity);
		return new SuccessResult("Resume eklendi");
	}

	@Override
	public DataResult<Resume> getById(int resumeId) {
		return new SuccessDataResult<Resume>
		(this.resumeRepository.findById(resumeId), "Data listelendi");
	}
	
	@Override
	public DataResult<ResumeDto> getResumeWithDetailsByCandidateId(int candidateId) {
		Candidate candidate = candidateService.getById(candidateId).getData();
		ResumeDto resumeDto = new ResumeDto();
		
		resumeDto.setCandidate(candidate);
		resumeDto.setSchools(schoolService.getAllByResume_Candidate_Id(candidateId).getData());
		resumeDto.setJobExperiences(jobExperienceService.getAllByResume_Candidate_Id(candidateId).getData());
		resumeDto.setLanguages(languageService.getAllByResume_Candidate_Id(candidateId).getData());
		resumeDto.setSkills(skillService.getAllByResume_Candidate_Id(candidateId).getData());
		resumeDto.setCoverLetters(coverLetterService.getAllByResume_Candidate_Id(candidateId).getData());
		
		return new SuccessDataResult<ResumeDto>(resumeDto, "aday CV'si detaylariyla listelendi");
	}

	@Override
	public Result delete(Resume entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Resume entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

	//@Override
	//public DataResult<List<ResumeWithDetailsDto>> getResumeWithAllDetails() {
	//	return new SuccessDataResult<List<ResumeWithDetailsDto>>
	//	(this.resumeRepository.getResumeWithAllDetails(), "Data listelendi");
	//}



}
