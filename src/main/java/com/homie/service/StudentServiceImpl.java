package com.homie.service;

import com.homie.dao.StudentMapper;
import com.homie.pojo.Students;

import java.util.List;

public class StudentServiceImpl implements StudentService{


    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper){this.studentMapper = studentMapper;}

    @Override
    public int insertStudent(Students students) {
        return studentMapper.insertStudent(students);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    public int updateStudent(Students students) {
        return studentMapper.updateStudent(students);
    }

    @Override
    public Students findStudentById(int id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public List<Students> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    @Override
    public Students findStudentByName(String name) {
        return studentMapper.findStudentByName(name);
    }

    @Override
    public Students findStudentByNumber(String number) {
        return studentMapper.findStudentByNumber(number);
    }

    @Override
    public List<Students> findStudentsByDetail(String detail) {
        return studentMapper.findStudentsByDetail(detail);
    }
}
