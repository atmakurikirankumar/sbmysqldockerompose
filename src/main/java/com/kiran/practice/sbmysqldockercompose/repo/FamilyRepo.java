package com.kiran.practice.sbmysqldockercompose.repo;

import com.kiran.practice.sbmysqldockercompose.model.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepo extends JpaRepository<FamilyMember, Integer> {
}
