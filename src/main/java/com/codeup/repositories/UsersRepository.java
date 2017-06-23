package com.codeup.repositories;


import com.codeup.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // this @ is optional..but CRUD is mandatory
public interface UsersRepository extends CrudRepository<User, Long> {
}
