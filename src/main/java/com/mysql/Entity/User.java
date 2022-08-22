package com.mysql.Entity;

import java.util.Objects;

public class User {
    private Integer work_experience;
    private Double salary;
    private String work_name;
    private String sex;
    private Integer age;

    public Integer getWork_experience() {
        return work_experience;
    }

    public void setWork_experience(Integer work_experience) {
        this.work_experience = work_experience;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getWork_name() {
        return work_name;
    }

    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(Integer work_experience, Double salary, String work_name, String sex, Integer age) {
        this.work_experience = work_experience;
        this.salary = salary;
        this.work_name = work_name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getWork_experience(), user.getWork_experience()) &&
                Objects.equals(getSalary(), user.getSalary()) &&
                Objects.equals(getWork_name(), user.getWork_name()) &&
                Objects.equals(getSex(), user.getSex()) &&
                Objects.equals(getAge(), user.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWork_experience(), getSalary(), getWork_name(), getSex(), getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "work_experience=" + work_experience +
                ", salary=" + salary +
                ", work_name='" + work_name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
