package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "resumes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","schools","jobExperiences","languages","skills","coverLetters"})

public class Resume {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "resume_id")
	 private int resumeId;

	 @NotBlank
	 @NotNull
	 @Column(name="gender")
	 private String gender;	 
	 
	 @OneToMany(mappedBy = "resume")
	  private List<School> schools;

	 @OneToMany(mappedBy = "resume")
	 private List<JobExperience> jobExperiences;

	 @OneToMany(mappedBy = "resume")
	 private List<Language> languages;
	 
	 @OneToMany(mappedBy = "resume")
	 private List<Skill> skills;
	 
	 @OneToMany(mappedBy = "resume")
	 private List<CoverLetter> coverLetters;
	
	 @ManyToOne()
	 @JoinColumn(name="candidate_id")
	 private Candidate candidate;
	
	

}
