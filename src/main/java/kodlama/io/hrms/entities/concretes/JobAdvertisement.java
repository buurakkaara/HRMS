package kodlama.io.hrms.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "job_advertisements")
public class JobAdvertisement {

	@Id
	@Column(name = "job_advertisement_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobAdvertisementId;
	
	@Column(name = "job_advertisement_description")
	private String jobDescription;
	
	@Column(name = "open_positions")
	private int openPositions;
	
	
	@Column(name = "application_deadline")
	private Date applicationDeadline;
	
	//@Column(name = "release_date_time")
	//private LocalDateTime releaseDateTime = LocalDateTime.now();
	
	@Column(name = "is_active")
	private boolean isActive = true ;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
}
	
	