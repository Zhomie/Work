package com.homie.service;

import com.homie.pojo.Students;


import java.util.List;

public interface StudentService {
    //增加一个人
    int insertStudent(Students students);

    //删除一个人
    int deleteStudent(int id);

    //更新一个人
    int updateStudent(Students students);

    //查询一个人
    Students findStudentById(int id);

    //查询所有人
    List<Students> findAllStudent();

    //根据姓名查询学生
    Students findStudentByName(String name);
    //根据学号查询学生
    Students findStudentByNumber(String number);
    //根据社团查询学生
    List<Students> findStudentsByDetail(String detail);
}
