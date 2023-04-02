package com.example.demo.repo;

import com.example.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author udarasan
 * @TimeStamp 2023-03-27 14:35
 * @ProjectDetails demo
 */
@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
}
