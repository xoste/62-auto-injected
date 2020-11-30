package com.xoste.leon.pojo;

/**
 * @author Xoste
 */
public class People {
    private Teacher teacher;

    public People() {
    }

    public People(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "People{" +
                "teacher=" + teacher +
                '}';
    }
}
