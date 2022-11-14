package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.City;

public interface CityRepository extends JpaRepository<City, Integer>{

	City getByCityId(int cityId);
	City getCityByCityName(String cityName);
	
}
