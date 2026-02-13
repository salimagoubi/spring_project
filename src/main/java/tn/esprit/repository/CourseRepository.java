package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.entities.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
