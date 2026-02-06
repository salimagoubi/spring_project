package tn.esprit.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCourse;

    private String emplacement;
    private LocalDate dateCourse;
}
