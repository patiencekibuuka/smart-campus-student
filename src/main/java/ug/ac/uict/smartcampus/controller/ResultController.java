package ug.ac.uict.smartcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ug.ac.uict.smartcampus.model.Result;
import ug.ac.uict.smartcampus.repository.ResultRepository;

@Controller
public class ResultController {

    private final ResultRepository resultRepository;

    public ResultController(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @GetMapping("/results")
    public String results(Model model) {

        model.addAttribute("results", resultRepository.findAll());
        model.addAttribute("result", new Result());

        return "results";
    }

    @PostMapping("/results/save")
    public String saveResult(Result result) {

        // Automatically calculate the grade
        if (result.getMarks() >= 80) {
            result.setGrade("A");
        } else if (result.getMarks() >= 70) {
            result.setGrade("B");
        } else if (result.getMarks() >= 60) {
            result.setGrade("C");
        } else if (result.getMarks() >= 50) {
            result.setGrade("D");
        } else {
            result.setGrade("F");
        }

        resultRepository.save(result);

        return "redirect:/results";
    }
}