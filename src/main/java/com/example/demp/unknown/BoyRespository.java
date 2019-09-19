package com.example.demp.unknown;

import com.example.demp.pojo.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cdx
 * Boy代表实体类
 * Integer代表ID的类型
 */
public interface BoyRespository extends JpaRepository<Boy,Integer> {

}
