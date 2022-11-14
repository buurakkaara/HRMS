package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "job_experiences")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes"})
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_experience_id")
	private int jobExperienceId;
	
	@NotBlank
	@NotNull
	@Column(name = "company_name")
	private String companyName;       
	
	@NotBlank
	@NotNull
	@Column(name = "job_position")
	private String jobPosition;
	
	@NotBlank
	@NotNull
	@Column(name = "start_year")
	private int startYear;
	
	@NotBlank
	@Column(name = "is_left")
	private boolean isLeft;
	
	@NotBlank
	@Column(name = "end_year")
	private int endYear;
	
	 @ManyToOne()
	 @JoinColumn(name="candidate_id")
	 private Candidate candidate;
	

	 @ManyToOne()
	 @JoinColumn(name="resume_id")
	 private Resume resume;
	
}
