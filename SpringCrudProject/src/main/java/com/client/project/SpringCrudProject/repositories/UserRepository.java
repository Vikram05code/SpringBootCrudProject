package com.client.project.SpringCrudProject.repositories;

import com.client.project.SpringCrudProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
