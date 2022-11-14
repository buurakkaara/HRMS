package kodlama.io.hrms.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.SystemEmployeeService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.SystemEmployee;

@RestController
@RequestMapping("api/employees")
public class SystemEmployeesControllers {

	private SystemEmployeeService systemEmployeeService;

	@Autowired
	public SystemEmployeesControllers(SystemEmployeeService systemEmployeeService) {
		super();
		this.systemEmployeeService = systemEmployeeService;
	}


	
	
	@GetMapping("/getall")
	public DataResult<List<SystemEmployee>> getAll(){
		return this.systemEmployeeService.getAll(); 
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SystemEmployee systemEmployee) {
		return this.systemEmployeeService.add(systemEmployee);
	}
	
	
}
