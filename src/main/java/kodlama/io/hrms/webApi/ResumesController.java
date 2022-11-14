package kodlama.io.hrms.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.ResumeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Resume;
import kodlama.io.hrms.entities.dtos.ResumeDto;

@RestController
@RequestMapping("/api/resumes")
public class ResumesController {

	private ResumeService resumeService;

	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Resume>> getAll() {
		return this.resumeService.getAll();
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {
		return this.resumeService.add(resume);
	}
	
	//@GetMapping("/getById")
	//public DataResult<Resume> getById(@RequestParam int resumeId) {
	//	return this.resumeService.getById(resumeId);
	//}
	
	
//	@GetMapping("/getResumeWithAllDetails")
	//public DataResult<List<ResumeWithDetailsDto>> getResumeWithAllDetails() {
	//	return this.resumeService.getResumeWithAllDetails();
	//}
	
	@GetMapping("getResumeWithDetailsByCandidateId")
	public DataResult<ResumeDto> getResumeWithDetailsByCandidateId(int candidateId){
		return resumeService.getResumeWithDetailsByCandidateId(candidateId);
	}
	
	
}
