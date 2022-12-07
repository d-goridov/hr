package com.dmitriygoridov.spring.mvc_hibernate_aop.controller;

import com.dmitriygoridov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.dmitriygoridov.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        model.addAttribute("allEmps", employeeService.getAllEmployees());
        return "all_employees";
    }
}
