package com.company.controller;

import com.company.entity.First;
import com.company.entity.Student;
import com.company.service.FirstService;
import com.company.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by chenyj on 16/1/14.
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    StudentService studentService;
    @Autowired
    private FirstService service;

    @RequestMapping(value = "getstudents", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getStudents(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView("teacher");
        List<Student> students = studentService.getByTeacher(name);
        modelAndView.addObject("students", students);
        modelAndView.addObject("teacher", name);
        return modelAndView;
    }
    
    @RequestMapping(value="first", method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView getFirst(@RequestParam("student") String student) {
    	ModelAndView andView = new ModelAndView("first");
    	List<First> first = service.first();
    	for (First first2 : first) {
    		System.out.println("这个是测试数据"+first2.getPass());
			System.out.println(first2.getName());
		}
    	andView.addObject("first", first);
        return andView;
    	
    }
}
