package ug.ac.uict.smartcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ug.ac.uict.smartcampus.model.Attendance;
import ug.ac.uict.smartcampus.repository.AttendanceRepository;

@Controller
public class AttendanceController {

    private final AttendanceRepository attendanceRepository;

    public AttendanceController(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @GetMapping("/attendance")
    public String attendance(Model model) {

        model.addAttribute("attendances", attendanceRepository.findAll());
        model.addAttribute("attendance", new Attendance());

        return "attendance";
    }

    @PostMapping("/attendance/save")
    public String saveAttendance(Attendance attendance) {

        attendanceRepository.save(attendance);

        return "redirect:/attendance";
    }
}