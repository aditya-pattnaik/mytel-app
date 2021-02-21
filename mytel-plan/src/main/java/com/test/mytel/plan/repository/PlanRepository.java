package com.test.mytel.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.mytel.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
