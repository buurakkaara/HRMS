package kodlama.io.hrms.entities.dtos;

import java.util.List;

import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.CoverLetter;
import kodlama.io.hrms.entities.concretes.JobExperience;
import kodlama.io.hrms.entities.concretes.Language;
import kodlama.io.hrms.entities.concretes.School;
import kodlama.io.hrms.entities.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {

	private Candidate candidate;
	private List<School> schools;
	private List<JobExperience> jobExperiences;
	private List<Language> languages;
	private List<Skill> skills;
	private List<CoverLetter> coverLetters;
}
