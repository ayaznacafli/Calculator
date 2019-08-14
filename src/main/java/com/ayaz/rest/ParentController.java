package com.ayaz.rest;

import com.ayaz.domain.Parent;
import com.ayaz.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping(value = "/rabita")
public class ParentController {

    @Autowired
    private ParentService parentService;


    @GetMapping(value = "/parent",headers = "Accept=application/json")
    public List<Parent> getParents() {
       List<Parent> parents = parentService.getParents();
       return parents;
    }

}
