package com.whoeveryou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whoeveryou.model.Team;

@Repository("teamRepository")
public interface TeamRepository extends JpaRepository<Team, Long> {

}
