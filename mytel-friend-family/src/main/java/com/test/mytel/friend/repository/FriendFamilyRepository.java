package com.test.mytel.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.mytel.friend.entity.FriendFamily;

public interface FriendFamilyRepository extends JpaRepository<FriendFamily, Integer> {

	List<FriendFamily> getByPhoneNo(Long phoneNo);
}
