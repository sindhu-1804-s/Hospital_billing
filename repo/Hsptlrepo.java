package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hsptlentity;

public interface Hsptlrepo extends JpaRepository<Hsptlentity,Integer>{

	Hsptlentity getByPid(int id);
}
