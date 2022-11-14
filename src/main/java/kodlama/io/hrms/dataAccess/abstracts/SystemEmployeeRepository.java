package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeRepository extends JpaRepository<SystemEmployee, Integer>{

}
