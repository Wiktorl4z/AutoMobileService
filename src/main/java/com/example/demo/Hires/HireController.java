package com.example.demo.Hires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("hires")
@RestController
public class HireController {

    @Autowired
    private HireService hireService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Hire> getAllHires() {
        return hireService.getAllHires();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Hire getHire(@PathVariable Long id) {
        return hireService.getHireId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addHire(@RequestBody Hire hire) {
        System.out.println("HERE HERE HERE");
        hireService.addHire(hire);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateHire(@RequestBody Hire hire) {
        hireService.updateHire(hire);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteHire(@PathVariable Long id) {
        hireService.deleteHire(id);
    }
}