package ug.ac.uict.smartcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ug.ac.uict.smartcampus.model.Course;
import ug.ac.uict.smartcampus.repository.CourseRepository;

@Controller
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/courses")
    public String courses(Model model) {

        model.addAttribute("courses", courseRepository.findAll());
        model.addAttribute("course", new Course());

        return "courses";
    }

    @PostMapping("/courses/save")
    public String saveCourse(Course course) {

        courseRepository.save(course);

        return "redirect:/courses";
    }
}