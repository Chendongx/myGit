package com.example.demp.Iresponsitory;

import com.example.demp.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookResponsitory extends JpaRepository<Book,Character> {
}
