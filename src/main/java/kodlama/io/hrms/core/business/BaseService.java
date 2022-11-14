package kodlama.io.hrms.core.business;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;

public interface BaseService<T> {
	public Result add(T entity);
	public Result delete(T entity);
	public Result update(T entity);
	public DataResult<List<T>> getAll();
	
}
