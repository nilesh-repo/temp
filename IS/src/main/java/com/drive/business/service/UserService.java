/*
 * Created on 20 nov 2015 ( Time 20:44:55 )
 * Generated by Máximo
 */
package com.drive.business.service;

import java.util.List;

import com.drive.bean.User;

/**
 * Business Service Interface for entity User.
 */
public interface UserService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	User findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<User> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	User save(User entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	User update(User entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	User create(User entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );
	
	List<?> queryFilter(Class<?> c, String field, String join, Object value);


}
