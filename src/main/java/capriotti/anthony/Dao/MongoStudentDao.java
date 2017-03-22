package capriotti.anthony.Dao;

import capriotti.anthony.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by anthonycapriotti on 3/22/17.
 */

@Repository
@Qualifier("mongoData")
public class MongoStudentDao implements StudentDao {

    //Connection mongo = new Connection()   fake db connection


    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>() {
            {
                add(new Student(66, "Mario", "Plumbing"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
