package com.sparta.doom.fantasticninewebandapi.repositories;

import com.sparta.doom.fantasticninewebandapi.models.UserDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserDoc, String> {
    Optional<UserDoc> findByEmail(String email);
}
