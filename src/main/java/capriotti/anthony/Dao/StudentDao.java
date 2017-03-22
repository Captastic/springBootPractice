package capriotti.anthony.Dao;

import capriotti.anthony.Entity.Student;

import java.util.Collection;

/**
 * Created by anthonycapriotti on 3/22/17.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
