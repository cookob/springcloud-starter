package com.minichn.repository;

import com.minichn.entity.Student;

import java.util.Collection;

/**
 * Created by minichn on 2019/8/18 0018.
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
