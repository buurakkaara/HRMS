package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Integer>{

	Resume findById(int resumeId);
	
	List<Resume> getAllByCandidate_Id(int candidateId);
	
	//@Query("Select new kodlama.io.hrms.entities.dtos.ResumeWithDetailsDto(r.resumeId,r.candidateId,r.coverLetter,je.companyName,je.jobPosition,je.startYear,je.endYear,je.isLeft,"+
	//	"s.schoolName,s.departmentName,s.educationStartYear,s.graduateYear,ed.isGraduate,l.languageName,l.languageLevel,"+
	//	 "s.skillName) from Resume r Inner Join r.jobExperiences je Inner Join r.schools s Inner Join r.languages l Inner Join r.skills s where r.candidate.id =: candidateId ")
	//List<ResumeWithDetailsDto> getResumeWithAllDetails();
	
}
