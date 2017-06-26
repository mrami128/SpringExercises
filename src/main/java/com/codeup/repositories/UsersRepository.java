package com.codeup.repositories;


import com.codeup.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // this @ is optional..but CRUD below is mandatory
public interface UsersRepository extends CrudRepository<User, Long> {

    public User findByUsername(String username);
}
