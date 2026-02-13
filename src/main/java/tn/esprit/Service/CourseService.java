package tn.esprit.Service;

import tn.esprit.repository.CourseRepository;
import tn.esprit.entities.Course;

public class CourseService implements ICourseService {

    CourseRepository cr;

    @Override
    public Course ajouterCourse(Course course) {
        return cr.save(course);
    }
}
