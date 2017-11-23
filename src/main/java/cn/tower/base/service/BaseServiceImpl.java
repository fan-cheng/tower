package cn.tower.base.service;

import cn.tower.base.mapper.BaseCrudMapper;
import com.github.pagehelper.PageHelper;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;


public abstract class BaseServiceImpl<T> implements BaseService<T>{
	
	private BaseCrudMapper<T> mapper;
	
	@PostConstruct
	private void initMapper(){
		mapper = init();
	}
	
	public abstract BaseCrudMapper<T> init();


	public int add(T entity) {
		return this.mapper.insert(entity);
	}

	public int deleteById(T entity) {
		return this.mapper.deleteByPrimaryKey(entity);
	}

	public int modifyById(T entity) {
		return this.mapper.updateByPrimaryKey(entity);
	}

	public T findById(T id) {
		return this.mapper.selectByPrimaryKey(id);
	}

	public List<T> findByPage(Integer pageNo, Map<String, Object> params) {
		PageHelper.startPage(pageNo,10);
		return this.mapper.selectByPage(pageNo,params);
	}

	public List<T> findByParam(Map<String, Object> params) {
		return this.mapper.selectByParams(params);
	}
}
