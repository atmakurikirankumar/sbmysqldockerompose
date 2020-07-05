package com.kiran.practice.sbmysqldockercompose.controller;

import com.kiran.practice.sbmysqldockercompose.model.AddMemberRequest;
import com.kiran.practice.sbmysqldockercompose.model.FamilyMember;
import com.kiran.practice.sbmysqldockercompose.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FamilyController {

    private final FamilyService service;

    @Autowired
    public FamilyController(FamilyService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<FamilyMember> getFamilyMembers() {
        return service.getFamilyMembers();
    }

    @PostMapping("/add-member")
    public FamilyMember addMember(@RequestBody AddMemberRequest data) {
        return service.addMember(data);
    }

}
