package com.llaiden.designpattern;

public class Worker implements Cloneable {

    private String name;
    private String gender;
    private String age;
    private String salary;
    private CloneTest cloneTest;


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setCloneTest(CloneTest cloneTest) {
        this.cloneTest = cloneTest;
    }

    public CloneTest getCloneTest() {
        return cloneTest;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", cloneTest=" + cloneTest +
                '}';
    }

    @Override
    protected Worker clone() {
        Worker worker = null;
        try {
            worker = (Worker) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return worker;
    }
}
