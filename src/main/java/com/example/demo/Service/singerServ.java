package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.singer;

public interface singerServ {
	
	public String upsert(singer sin);
	public List<singer> getAll();
	public singer findbyid(Integer id);
	public String deleteById(Integer id);
	
	
	 // custome finder method 
//	public List<singer> findByName(String name);

}
