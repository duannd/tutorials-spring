package com.duannd.spring.data.jpa.postgres.repositories;

import com.duannd.spring.data.jpa.postgres.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By duan.nguyen
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
