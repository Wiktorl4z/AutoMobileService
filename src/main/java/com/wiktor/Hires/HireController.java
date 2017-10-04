package com.wiktor.hires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("hires")
@RestController
public class HireController {

    private HireService hireService;

    @Autowired
    public HireController(HireService hireService) {
        this.hireService = hireService;
    }

    @GetMapping
    public List<Hire> getAllHires() {
        return hireService.getAllHires();
    }

    @GetMapping(value = "/{id}")
    public Hire getHire(@PathVariable Long id) {
        return hireService.getHireId(id);
    }

    @PostMapping
    public void addHire(@RequestBody Hire hire) {
        hireService.addHire(hire);
    }

    @PutMapping(value = "/{id}")
    public void updateHire(@RequestBody Hire hire) {
        hireService.updateHire(hire);
    }

    @DeleteMapping (value = "/{id}")
    public void deleteHire(@PathVariable Long id) {
        hireService.deleteHire(id);
    }
}