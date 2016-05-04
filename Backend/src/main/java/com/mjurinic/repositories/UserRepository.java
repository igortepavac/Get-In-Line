package com.mjurinic.repositories;

import com.mjurinic.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by mjurinic on 04.05.16..
 */
@Repository
@Table(name = "users")
public interface UserRepository extends CrudRepository<User, Integer> {

}
