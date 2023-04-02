package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author udarasan
 * @TimeStamp 2023-03-27 14:34
 * @ProjectDetails demo
 */
@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
