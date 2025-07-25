package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);


    /**
     * 添加员工
     * @param employee
     */
    void add(EmployeeDTO employee);

    /**
     * 分页查询
     * @param pageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO pageQueryDTO);

    /**
     * 修改员工状态
     * @param status
     * @param id
     */
    void startOrStop(Integer status, long id);
}
