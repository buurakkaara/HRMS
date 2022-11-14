package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementRepository extends JpaRepository<JobAdvertisement, Integer>{

	List<JobAdvertisement> getAllByIsActiveTrue();
	
	
	List<JobAdvertisement> getAllByEmployer_CompanyNameAndIsActiveTrue(String companyName);
	
	
	//List<JobAdvertisement> getAllByOrderByApplicationDeadlineAsc();
	
	
	//@Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto(j.id , e.company_name,j.openPositions,j.jobDescription,j.applicationDeadline)"
     //	    +" From JobAdvertisement j Inner Join j.employer e" )
	//List<JobAdvertisementDto> getJobAdvertisementsWithEmployerDetails();
	
	
	/*
	 * @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto" +
	 * "(a.jobAdvertisementId, e.companyName, j.title, a.description, " +
	 * "c.cityName,a.applicationDeadline, a.activationStatus) " +
	 * "From JobAdvertisement a Inner Join a.employer e Inner Join a.job j Inner Join a.city c "
	 * + "Where a.isActive = true") List<JobAdvertisementDto> getAllByIsActive();
	 */
	
	
	/*
	 * @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto" +
	 * "(a.jobAdvertisementId, e.companyName, j.title, a.description, " +
	 * "a.openPositions, c.cityName,a.applicationDeadline, a.isActive) " +
	 * "From JobAdvertisement a Inner Join a.employer e Inner Join a.job j Inner Join a.city c "
	 * + "Where e.companyName =: companyName and a.isActive = true ")
	 * List<JobAdvertisementDto> getAllActiveByCompanyName(String companyName);
	 */
	
	
	
}
