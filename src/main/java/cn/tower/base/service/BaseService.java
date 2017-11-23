package cn.tower.base.service;

import java.util.List;
import java.util.Map;

/**
 * Service 基类
 * @param <T>
 */
public interface BaseService<T> {

    /**
     * 添加对象
     * @param entity 对象
     * @return
     */
     int add(T entity);

    /**
     * 删除对象
     * @param entity 对象
     * @return
     */
     int deleteById(T entity);

    /**
     * 修改对象
     * @param entity
     * @return
     */
     int modifyById(T entity);

    /**
     * 根据id查找对象
     * @param id
     * @return 对象
     */
     T findById(T id);

    /**
     * 分页参数查找对象集合
     * @param pageNo 页码
     * @param params 参数集合
     * @return  对象集合
     */
     public List<T> findByPage(Integer pageNo, Map<String, Object> params);

    /**
     * 参数查询对象集合
     * @param params 参数集合
     * @return 对象集合
     */
     List<T> findByParam(Map<String, Object> params);
}
