package com.infosys.infytel.plan.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.plan.dto.PlanDTO;
import com.infosys.infytel.plan.service.PlanService;

@RestController
@CrossOrigin
public class PlanController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlanService planService;

	// Fetches all plan details
	@GetMapping(value = "/plans", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PlanDTO> getAllPlans() {
		logger.info("Fetching all plans");
		return planService.getAllPlans();
	}

	// Fetch plan details of a specific plan
	@GetMapping(value = "/plans/{planId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PlanDTO getSpecificPlans(@PathVariable Integer planId) {
		logger.info("Fetching details of plan {}", planId);
		return planService.getSpecificPlan(planId);
	}

}
