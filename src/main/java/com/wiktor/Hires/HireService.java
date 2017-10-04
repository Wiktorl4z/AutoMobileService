package com.wiktor.hires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class HireService {

    private HireRepository hireRepository;

    @RequestMapping("/hires/")
    public List<Hire> getAllHires() {
        return hireRepository.findAll();
    }

    @Autowired
    public HireService(HireRepository hireRepository) {
        this.hireRepository = hireRepository;
    }

    public Hire getHireId(Long id) {
        return hireRepository.findOne(id);
    }

    public void addHire(Hire hire) {
        hireRepository.save(hire);
    }

    public void updateHire(Hire hire) {
        hireRepository.save(hire);
    }

    public void deleteHire(Long id) {
        hireRepository.delete(id);
    }

}
