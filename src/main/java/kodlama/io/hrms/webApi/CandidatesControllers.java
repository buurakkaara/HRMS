package kodlama.io.hrms.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Candidate;

@RequestMapping("api/candidates")
@RestController
public class CandidatesControllers {


		private CandidateService candidateService;
		
		@Autowired
		public CandidatesControllers(CandidateService candidateService) {
			super();
			this.candidateService = candidateService;
		}


		@GetMapping("/getall")
		public DataResult<List<Candidate>> getAll(){
			return this.candidateService.getAll(); 
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Candidate candidate) {
			return this.candidateService.add(candidate);
		}
		
		//@GetMapping("/getCandidateByUserId")
		//public DataResult<Candidate> getCandidateById(@RequestParam int userId){
		//	return this.candidateService.getCandidateById(userId); 
		//}
		
	
}
