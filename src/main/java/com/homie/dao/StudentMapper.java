package com.homie.dao;

import com.homie.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //增加一个人
    int insertStudent(Students students);

    //删除一个人
    int deleteStudent(@Param("studentId") int id);

    //更新一个人
    int updateStudent(Students students);

    //查询一个人
    Students findStudentById(@Param("studentId")int id);

    //查询所有人
    List<Students> findAllStudent();

    //根据名字查询学生
    Students findStudentByName(@Param("studentName")String studentName);
    //根据学号查询学生
    Students findStudentByNumber(@Param("studentNumber")String studentNumber);
    //根据社团查询学生
    List<Students> findStudentsByDetail(@Param("detail")String detail);
}
