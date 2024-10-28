package com.example.fitnessTracker.repository;

import com.example.fitnessTracker.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActivityRepository extends JpaRepository<Activity,Long> {
}
