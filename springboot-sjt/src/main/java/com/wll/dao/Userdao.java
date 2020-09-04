package com.wll.dao;

import com.wll.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<User,Long> {
}
