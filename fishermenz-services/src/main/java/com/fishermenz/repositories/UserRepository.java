package com.fishermenz.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fishermenz.entities.User;

/**
 * 
 * @author yogans_s
 * Repository to query and update user related information to the underlying database.
 *
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByFirstName(String firstName);
	public User findByLastName(String lastName);
	public User findByEmailAddress(String emailAddress);
}