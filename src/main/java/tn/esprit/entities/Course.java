package tn.esprit.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;
    private LocalDate dateCourse;

    @ManyToOne
    @JoinColumn(name="championnat_id")
    private Championnat championnat;

    @OneToMany(mappedBy="course")
    private List<Position> positions;
}
