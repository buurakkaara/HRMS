package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CityService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CityRepository;
import kodlama.io.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{

	
	private CityRepository cityRepository;
	
	@Autowired
	public CityManager(CityRepository cityRepository) {
		super();
		this.cityRepository = cityRepository;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>
		(this.cityRepository.findAll(), "Şehirler listelendi");
	}

	@Override
	public Result add(City city) {
		this.cityRepository.save(city);
		return new SuccessResult("Şehir eklendi");
	}

	@Override
	public DataResult<City> getByCityId(int cityId) {
		return new SuccessDataResult<City>
		(this.cityRepository.getByCityId(cityId), "Data listelendi");
	}

	@Override
	public DataResult<City> getCityByCityName(String cityName) {
		return new SuccessDataResult<City>
		(this.cityRepository.getCityByCityName(cityName), "Data listelendi");
	}

}
