package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public abstract class Lesson implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private Integer position;

    private Section section;

    // Set usado na relação muitos para muitos
    private Set<Enrollment> enrollmentsDone = new HashSet<>();

    public Lesson() {}

    public Lesson(Long id, String title, Integer position, Section section) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Set<Enrollment> getEnrollmentsDone() {
        return enrollmentsDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        return getId().equals(lesson.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
