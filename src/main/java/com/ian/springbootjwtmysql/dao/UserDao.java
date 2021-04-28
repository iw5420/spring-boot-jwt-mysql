package com.ian.springbootjwtmysql.dao;

/**
 * @author Ian Wang
 * @date 2021-04-28
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ian.springbootjwtmysql.model.DAOUser;




@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
