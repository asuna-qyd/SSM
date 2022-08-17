package com.asuna.ssm.controller;

import com.asuna.ssm.pojo.Employee;
import com.asuna.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //��ѯ���е�Ա����Ϣ
        List<Employee> employeeList = employeeService.getAllEmployee();
        //��Ա����Ϣ���������й���
        model.addAttribute("employeeList", employeeList);
        //��ת��employee_list.html
        return "employee_list";
    }


}
