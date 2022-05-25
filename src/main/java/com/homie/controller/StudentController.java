package com.homie.controller;


import com.homie.pojo.Students;
import com.homie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    //调用service层
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/allStudent")
    public String list(Model model){
        List<Students> list = studentService.findAllStudent();
        model.addAttribute("list",list);
        return "allStudent";
    }

    //跳转到增加学生页面
    @RequestMapping("addStudent")
    public String AddPage(){
        return "addStudent";
    }
    //添加学生得请求
    @RequestMapping("add")
    public String AddStudent(Students students){
        studentService.insertStudent(students);
        return "redirect:/student/allStudent";
    }
    //跳转到修改页面
    @RequestMapping("updateStudent")
    public String toUpDatePage(int id,Model model){
        Students student = studentService.findStudentById(id);
        model.addAttribute("fstudent",student);
        return "updateStudent";
    }
    //修改学生请求
    @RequestMapping("update")
    public String UpdateStudent(Students students){
        studentService.updateStudent(students);
        return "redirect:/student/allStudent";
    }
    //删除学生
    @RequestMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") int id){
        studentService.deleteStudent(id);
        return "redirect:/student/allStudent";
    }
    //查询学生请求
    @RequestMapping("/findStudent")
    public String findStudent(String findStudentName,Model model){
        Students student = studentService.findStudentByName(findStudentName);
        List<Students> list =new ArrayList<>();
        list.add(student);
        if(student==null){
            list = studentService.findAllStudent();
            model.addAttribute("error","未查到相关学生信息");
        }
        model.addAttribute("list",list);
        return "allStudent";
    }
    //根据number查询学生
    @RequestMapping("/findStudentByNumber")
    public String findStudentByNumber(String number,Model model){
        Students student = studentService.findStudentByNumber(number);
        List<Students> list =new ArrayList<>();
        list.add(student);
        if(student==null){
            list = studentService.findAllStudent();
            model.addAttribute("error","未查到相关学生信息");
        }
        model.addAttribute("list",list);
        return "allStudent";
    }
    @RequestMapping("/students")
    public String findStudentsByDetail(String detail,Model model){
        List<Students> list = studentService.findStudentsByDetail(detail);
        model.addAttribute("list",list);
        return "allStudent";
    }

}
