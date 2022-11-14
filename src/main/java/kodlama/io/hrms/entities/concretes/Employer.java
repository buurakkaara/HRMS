package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
//@PrimaryKeyJoinColumn(name="employer_id", referencedColumnName = "id")
public class Employer extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employer_id")
	private int id;
	
	@NotNull
	@Column(name="company_name")
	private String companyName;
	
	@NotNull
	@Column(name="web_adress")
	private String webAdress;
	
	@NotNull
	@Column(name="phone_number")
	private String phoneNumber;

	

	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;


	
	
}
