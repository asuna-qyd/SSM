package com.asuna.ssm.mapper;

import com.asuna.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * ��ѯ���е�Ա����Ϣ
     * @return
     */
    List<Employee> getAllEmployee();
}
