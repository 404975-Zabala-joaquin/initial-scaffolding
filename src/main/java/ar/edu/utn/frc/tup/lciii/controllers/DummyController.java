package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.dtos.DummyDto;
import ar.edu.utn.frc.tup.lciii.models.Dummy;
import ar.edu.utn.frc.tup.lciii.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @Autowired
   private DummyService dummyService;

    @GetMapping("")
    private ResponseEntity<DummyDto> getDummy(){
       List<Dummy> dummies=  dummyService.getAllDummy();
        return null;
    }

    @GetMapping("{id}")
    private ResponseEntity<DummyDto> getDummyById(@PathVariable Long id){
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }
    @PostMapping("")
    private ResponseEntity<DummyDto> postDummy(DummyDto dummyDto){
       Dummy dummy = dummyService.createDummy(null);
        return null;
    }
    @PutMapping("")
    private ResponseEntity<DummyDto> putDummy(DummyDto dummyDto){
        Dummy dummy = dummyService.updateDummy(null);
        return null;
    }
    @DeleteMapping("")
    private ResponseEntity<DummyDto> deleteDummy(DummyDto dummyDto){
        dummyService.deleteDummy(null);
        return null;
    }
}
