package com.aanorbel.studentManagement.DAO;

import com.aanorbel.studentManagement.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.studentManagement.DAO, project OOPLaps
 * class function
 */
public class StudentDao {
    /**
     * The Rs.
     */
    ResultSet rs;
    /**
     * The Student.
     */
    Student student;
    /**
     * The Pst.
     */
    PreparedStatement pst;

    /**
     * Create boolean.
     *
     * @param newstudent the newstudent
     * @return the boolean
     */
    public Student create(Student newstudent) {
        String query = "INSERT INTO students  (`matricule`, `age`, `gender`, `name`)  VALUES (?,?,?,?);";
        try {
            pst = DBconnection.openConnection().prepareStatement(query);
            pst.setString(1, newstudent.getMatricule());
            pst.setInt(2, newstudent.getAge());
            pst.setString(3, newstudent.getGender());
            pst.setString(4, newstudent.getName());
            int n = pst.executeUpdate();
            if (n == 1) {
                return newstudent;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e + "Unable to create Student");
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
            DBconnection.closeConnection();
        }
        return null;
    }

    /**
     * Update boolean.
     *
     * @param student the student
     * @return the boolean
     * @throws Exception the exception
     */
    public Student update(Student student){
        String query = "UPDATE students SET  " +
                "`matricule`=\'"+student.getMatricule()+"\'," +
                " `age`="+student.getAge()+", " +
                "`gender`=\'"+student.getGender()+"\'," +
                " `name`=\'"+student.getName()+"\'" +
                " WHERE `matricule`=\'" + student.getId() + "\';";
        try {
            pst = DBconnection.openConnection().prepareStatement(query);
            int n = pst.executeUpdate();
            if (n == 1) {
                return student;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println(e + "Wrong Student values");
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
            DBconnection.closeConnection();
        }
        return null;
    }

    /**
     * Delete boolean.
     *
     * @param student the student
     * @return the boolean
     */
    public boolean delete(Student student) {
        String query = "DELETE FROM students WHERE matricule=?;";
        try {
            pst = DBconnection.openConnection().prepareStatement(query);
            pst.setString(1, student.getMatricule());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Could not delete Student");
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
            DBconnection.closeConnection();
        }
        return true;
    }

    /**
     * Find all students array list.
     *
     * @return the array list
     */
    public ArrayList<Student> findAllStudents() {
        ArrayList<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";
        try {
            pst = DBconnection.openConnection().prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setMatricule(rs.getString("matricule"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getString("gender"));
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println(e + ":Wrong query");
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException se) {
                System.out.println(se);
            }
            DBconnection.closeConnection();
        }
        return students;
    }
}
