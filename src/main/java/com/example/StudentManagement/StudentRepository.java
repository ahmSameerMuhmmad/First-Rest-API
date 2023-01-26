package com.example.StudentManagement;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db=new HashMap<>();

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent(Student student){
        int id=student.getAdmnNo();
        db.put(id,student);
        return "Added Successfully!";

    }

    public String updateStudent(int id,int age){
        if(!db.containsKey(id)){
            return null;
        }
        db.get(id).setAge(20);
        return "Age updated successfully!";
    }

    public String deleteStudent(int id){
        if(!db.containsKey(id)){
            return null;
        }
        db.remove(id);
        return "Student removed Successfully!";
    }

}
