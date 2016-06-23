package com.aanorbel.studentManagement.entity;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.studentManagement.entity, project OOPLaps
 * class function
 */
public class Student {
    /**
     * The Matricule.
     */
    private String matricule;
    /**
     * The Name.
     */
    private String name;
    /**
     * The Age.
     */
    private int age;
    /**
     * The Gender.
     */
    private String gender;

    private int id;
    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param matricule the matricule
     * @param name      the name
     * @param age       the age
     * @param gender    the gender
     */
    public Student(String matricule, String name, int age, String gender) {
        this.matricule = matricule;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Gets matricule.
     *
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Sets matricule.
     *
     * @param matricule the matricule
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matricule='" + matricule + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
