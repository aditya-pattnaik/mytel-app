package com.test.mytel.calldetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.mytel.calldetails.entity.CallDetails;

public interface CallDetailsRepository extends JpaRepository<CallDetails, Long> {

	List<CallDetails> findByCalledBy(long calledBy);
}
