package or.perso.skillconnec.controller;

import or.perso.skillconnec.entities.Tutor;
import or.perso.skillconnec.service.ITutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tutors")
public class TutorService {
   @Autowired
    ITutorService tutorService;

    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        return tutorService.createTutor(tutor);
    }

    @GetMapping("/{id}")
    public Tutor getTutor(@PathVariable Long id) {
        return tutorService.getTutorById(id);
    }

    @GetMapping
    public Iterable<Tutor> getAllTutors() {
        return tutorService.getAllTutors();
    }

    @PutMapping("/{id}")
    public Tutor updateTutor(@PathVariable Long id, @RequestBody Tutor tutor) {
        return tutorService.updateTutor(id, tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteTutor(@PathVariable Long id) {
        tutorService.deleteTutor(id);
    }

}

