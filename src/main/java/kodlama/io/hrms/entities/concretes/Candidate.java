package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes","schools","languages","jobExperiences"})
//@PrimaryKeyJoinColumn(name="candidate_id", referencedColumnName = "id")
public class Candidate extends User{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name="identity_number")
	private String identityNumber;
	
	@NotBlank
	@NotNull
	@Column(name="birth_year")
	private String birthYear;

	@OneToMany(mappedBy = "candidate")
	private List<Resume> resumes;
	
	@OneToMany(mappedBy = "candidate")
	private List<School> schools;         
	
	@OneToMany(mappedBy = "candidate")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "candidate")
	private List<JobExperience> jobExperiences;
}
