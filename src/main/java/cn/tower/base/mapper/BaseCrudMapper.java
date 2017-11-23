package cn.tower.base.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * mapper基本的增删改查
 * @param <T>
 */
public interface BaseCrudMapper<T> {
    /**
     * 插入对象
     * @param entity
     * @return 返回受影响的条数
     */
    int insert(T entity);

    /**
     * 根据主键删除记录
     * @param id
     * @return 返回受影响的条数
     */
    int deleteByPrimaryKey(T id);

    /**
     * 根据主键修改记录
     * @param entity
     * @return 返回受影响条数
     */
    int updateByPrimaryKey(T entity);


    /**
     * 主键查询对象
     * @param id
     * @return 单个对象
     */
    T selectByPrimaryKey(T id);

    /**
     * 分页查询对象集合
     * @param pageNo  页码
     * @param params  条件查询参数
     * @return 对象集合
     */
    List<T> selectByPage(Integer pageNo, @Param("params") Map<String, Object> params);

    /**
     * 条件查询集合
     * @param params
     * @return 对象集合
     */
    List<T> selectByParams(@Param("params") Map<String, Object> params);
}
