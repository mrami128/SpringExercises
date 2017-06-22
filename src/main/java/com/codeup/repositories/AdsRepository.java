package com.codeup.repositories;

import com.codeup.models.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdsRepository extends CrudRepository<Ad, Long> {
}
