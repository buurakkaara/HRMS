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
@Table(name = "schools")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume","candidate"})
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id")
	private int schoolId;
		
	@NotBlank
	@NotNull
	@Column(name = "school_name")
	private String schoolName;
	
	@NotBlank
	@NotNull
	@Column(name = "department_name")
	private String departmentName;
		
	@NotBlank
	@NotNull
	@Column(name = "education_start_year")
	private int educationStartYear;
	
	@NotBlank
	@Column(name = "is_graduate")
	private boolean isGraduate;
	
	@NotBlank
	@Column(name = "graduate_year")
	private int graduateYear;
	
	
	 @ManyToOne()
	 @JoinColumn(name="resume_id")
	 private Resume resume;
	
	 @ManyToOne()
	 @JoinColumn(name="candidate_id")
	 private Candidate candidate;
}
