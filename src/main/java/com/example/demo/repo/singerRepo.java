package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.singer;

@Repository
public interface singerRepo extends JpaRepository<singer,Integer> {
//	public List<singer> findBySname(String name);
}
