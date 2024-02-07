package com.zep.cafemanagement.dao;

import com.zep.cafemanagement.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
