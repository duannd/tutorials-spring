package com.duannd.spring.data.jpa.h2.repositories;

import com.duannd.spring.data.jpa.h2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By duan.nguyen
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
