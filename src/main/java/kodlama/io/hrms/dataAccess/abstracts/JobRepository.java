package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

	Job getByTitle(String title);
	
}
