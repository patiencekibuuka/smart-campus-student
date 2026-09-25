package ug.ac.uict.smartcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ug.ac.uict.smartcampus.model.Registration;
import ug.ac.uict.smartcampus.repository.RegistrationRepository;

@Controller
public class RegistrationController {

    private final RegistrationRepository registrationRepository;

    public RegistrationController(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @GetMapping("/registrations")
    public String registrations(Model model) {

        model.addAttribute("registrations", registrationRepository.findAll());
        model.addAttribute("registration", new Registration());

        return "registrations";
    }

    @PostMapping("/registrations/save")
    public String saveRegistration(Registration registration) {

        registrationRepository.save(registration);

        return "redirect:/registrations";
    }
}