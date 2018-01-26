package com.inft4001.repository;

import com.inft4001.domain.User;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the User entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
