package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.singer;
import com.example.demo.repo.singerRepo;

@Service
public  class singerServiceIml implements singerServ {
	


	@Autowired
	private singerRepo sinRepo; 

	@Override
	public String upsert(singer sin) {
		sinRepo.save(sin);
		return "succes";
	}

	@Override
	public List<singer> getAll() {
		 return sinRepo.findAll();
		
	}

	@Override
	public singer findbyid(Integer id) {
		 Optional<singer> op=sinRepo.findById(id);
		
	 if(op.isPresent()) {
		 return op.get();
	 }
		return null;
	}

	@Override
	public String deleteById(Integer id) {
	if(sinRepo.existsById(id)) {
		sinRepo.deleteById(id);
		return "deleted";
	}
	else {
		return "Record is not available";
		
	}
	
		
	}

//	@Override
//	public void save(singer sin) {
//		// TODO Auto-generated method stub
//		
//	}
	
//	@Override
//	public List<singer> findByName(String name) {
//		
//		return sinRepo.findBySname(name);
//	}
//	

}
