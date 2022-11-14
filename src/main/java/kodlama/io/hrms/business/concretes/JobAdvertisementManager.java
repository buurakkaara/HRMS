package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CityRepository;
import kodlama.io.hrms.dataAccess.abstracts.EmployerRepository;
import kodlama.io.hrms.dataAccess.abstracts.JobAdvertisementRepository;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;
import kodlama.io.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	
	private JobAdvertisementRepository jobAdvertisementRepository;
	private CityRepository cityRepository;
	private EmployerRepository employerRepository;
	
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementRepository jobAdvertisementRepository, CityRepository cityRepository,
			EmployerRepository employerRepository) {
		super();
		this.jobAdvertisementRepository = jobAdvertisementRepository;
		this.cityRepository = cityRepository;
		this.employerRepository = employerRepository;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementRepository.findAll(), "Data listelendi");
	}

	@Override
	public Result add(JobAdvertisementDto jobAdvertisementDto) {
		JobAdvertisement jobAdvertisement = new JobAdvertisement();
		
		jobAdvertisement.setActive(jobAdvertisementDto.isActive());  
        jobAdvertisement.setJobDescription(jobAdvertisementDto.getJobDescription());
        jobAdvertisement.setOpenPositions(jobAdvertisementDto.getOpenPositions());
        jobAdvertisement.setApplicationDeadline(jobAdvertisementDto.getApplicationDeadline());
      
        jobAdvertisement.setCity(this.cityRepository.getById(jobAdvertisementDto.getCityId()));
        jobAdvertisement.setCity(this.cityRepository.getCityByCityName(jobAdvertisementDto.getCityName()));
        jobAdvertisement.setEmployer(this.employerRepository.getById(jobAdvertisementDto.getEmployerId())); 
        jobAdvertisement.setEmployer(this.employerRepository.getEmployerByCompanyName(jobAdvertisementDto.getCompanyName()));
        
		this.jobAdvertisementRepository.save(jobAdvertisement);
		return new SuccessResult("Data eklendi");
	}

	/*
	 * @Override public DataResult<List<JobAdvertisementDto>> getAllByIsActive() {
	 * return new SuccessDataResult<List<JobAdvertisementDto>>
	 * (this.jobAdvertisementRepository.getAllByIsActive(),"Data listelendi"); }
	 */

	/*
	 * @Override public DataResult<List<JobAdvertisementDto>>
	 * getAllActiveByCompanyName(String companyName) { return new
	 * SuccessDataResult<List<JobAdvertisementDto>>
	 * (this.jobAdvertisementRepository.getAllActiveByCompanyName(companyName),
	 * "Data listelendi"); }
	 */

	
	  @Override
	  public DataResult<List<JobAdvertisement>> getAllByIsActive() {
	  return new SuccessDataResult<List<JobAdvertisement>>
	  (this.jobAdvertisementRepository.getAllByIsActiveTrue(), "Data listelendi");
	  }
	  
	  
		
	   @Override 
	   public DataResult<List<JobAdvertisement>> getAllByCompanyNameAndIsActiveTrue(String companyName) { 
		   return new SuccessDataResult<List<JobAdvertisement>>
	   (this.jobAdvertisementRepository.getAllByEmployer_CompanyNameAndIsActiveTrue(companyName), "Data listelendi"); 
	}
		  
		 
		/* @Override public DataResult<List<JobAdvertisement>>
		 * getAllByOrderByApplicationDeadlineAsc() { return new
		 * SuccessDataResult<List<JobAdvertisement>>
		 * (this.jobAdvertisementRepository.getAllByOrderByApplicationDeadlineAsc(),
		 * "Data listelendi"); }
		 */
	 

	//@Override
	//public DataResult<List<JobAdvertisementDto>> getJobAdvertisementsWithEmployerDetails() {
	//	return new SuccessDataResult<List<JobAdvertisementDto>>
	//	(this.jobAdvertisementRepository.getJobAdvertisementsWithEmployerDetails(), "Data listelendi");
	//}
	
	
	


}
