package com.kiran.practice.sbmysqldockercompose.service;

import com.kiran.practice.sbmysqldockercompose.model.AddMemberRequest;
import com.kiran.practice.sbmysqldockercompose.model.FamilyMember;
import com.kiran.practice.sbmysqldockercompose.repo.FamilyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    private final FamilyRepo db;

    @Autowired
    public FamilyService(FamilyRepo db) {
        this.db = db;
    }

    public List<FamilyMember> getFamilyMembers() {
        return db.findAll();
    }

    public FamilyMember addMember(AddMemberRequest data) {
        FamilyMember member = new FamilyMember();
        member.setFirstName(data.getName());
        member.setLastName("Atmakuri");

        return db.save(member);
    }
}
