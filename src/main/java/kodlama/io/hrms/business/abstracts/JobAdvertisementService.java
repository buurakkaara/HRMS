package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;
import kodlama.io.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();
	
	Result add(JobAdvertisementDto jobAdvertisementDto);
	
	
	DataResult<List<JobAdvertisement>> getAllByIsActive();
	
	
	DataResult<List<JobAdvertisement>> getAllByCompanyNameAndIsActiveTrue(String companyName);
	
	
	//DataResult<List<JobAdvertisement>> getAllByOrderByApplicationDeadlineAsc();
	
	//DataResult<List<JobAdvertisementDto>> getJobAdvertisementsWithEmployerDetails();
	
	//DataResult<List<JobAdvertisementDto>> getAllByIsActive();
	
	//DataResult<List<JobAdvertisementDto>> getAllActiveByCompanyName(String companyName);
}
