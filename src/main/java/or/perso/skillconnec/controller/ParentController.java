package or.perso.skillconnec.controller;

import lombok.Getter;
import or.perso.skillconnec.entities.Parent;
import or.perso.skillconnec.service.ParentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parents")
public class ParentController {
    @Autowired
    ParentServiceImpl parentService;
    @GetMapping("/{id}")
    public Parent getParent(@PathVariable long id) {
        return parentService.getParentById(id);
    }
    @GetMapping
    public Iterable<Parent> getaAllParents() {
        return parentService.getAllParents();

    }
    @PostMapping
    public Parent addParent(@RequestBody Parent parent) {
        return parentService.createParent(parent);
    }
    @PutMapping("/{id}")
    public Parent updateParent(@PathVariable Long id, @RequestBody Parent parent) {
        return parentService.updateParent(id, parent);
    }

    @DeleteMapping("/{id}")
    public void deleteParent(@PathVariable Long id) {
        parentService.deleteParent(id);
    }


}
