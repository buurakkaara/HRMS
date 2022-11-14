package kodlama.io.hrms.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;
import kodlama.io.hrms.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisementDto jobAdvertisementDto) {
		return this.jobAdvertisementService.add(jobAdvertisementDto);
	}
	
	/*
	 * @GetMapping("/getAllByIsActive") public DataResult<List<JobAdvertisementDto>>
	 * getAllByIsActive(){ return this.jobAdvertisementService.getAllByIsActive(); }
	 */
	
	/*
	 * @GetMapping("/getAllActive") public DataResult<List<JobAdvertisementDto>>
	 * getAllActiveByCompanyName(@RequestParam String companyName){ return
	 * this.jobAdvertisementService.getAllActiveByCompanyName(companyName); }
	 */
	
	
	 @GetMapping("/getAllByIsActiveTrue") 
	 public DataResult<List<JobAdvertisement>> getAllByIsActive() { 
		return this.jobAdvertisementService.getAllByIsActive(); 
	 }
	  
	  
	  @GetMapping("/getAllByEmployer_CompanyNameAndIsActiveTrue") 
	  public DataResult<List<JobAdvertisement>> getAllByCompanyNameAndIsActiveTrue(@RequestParam String companyName){ 
		  return this.jobAdvertisementService.getAllByCompanyNameAndIsActiveTrue(companyName);
	  }
	 
	  
	 /* @GetMapping("/getAllByOrderByApplicationDeadlineAsc") public
	 * DataResult<List<JobAdvertisement>> getAllByOrderByApplicationDeadlineAsc() {
	 * return this.jobAdvertisementService.getAllByOrderByApplicationDeadlineAsc();
	 * }
	 */
	//@GetMapping
	//public DataResult<List<JobAdvertisementDto>> getJobAdvertisementsWithEmployerDetails() {
	//	return this.jobAdvertisementService.getJobAdvertisementsWithEmployerDetails();
	//o}
	
}
	
	
