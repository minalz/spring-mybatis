package cn.minalz.crud.dao;

import cn.minalz.crud.bean.Employee;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: qingshan
 */
public interface EmployeeMapper {

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int updateBatch(List<Employee> list);

    int insertSelective(Employee record);

    int batchInsert(List<Employee> list);

    Employee selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    void deleteByList(List<Integer> ids);

    long countByMap(HashMap<String,String> map);

    List<Employee> selectByMap(HashMap<String, Object> map);
}