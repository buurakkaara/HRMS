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
@Table(name = "languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume","candidate"})
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private int languageId;
	
	@NotBlank
	@NotNull
	@Column(name = "language_name")
	private String languageName;
	
	@NotNull
	@Column(name = "language_level")
	private int languageLevel;
	

	 @ManyToOne()
	 @JoinColumn(name="resume_id")
	 private Resume resume;
	
	 @ManyToOne()
	 @JoinColumn(name="candidate_id")
	 private Candidate candidate;
	
}
