package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.singer;
import com.example.demo.QRCode.QrCodeGenerated;
import com.example.demo.Service.singerServ;
import com.google.zxing.WriterException;

@RestController
@RequestMapping("/singer")
@CrossOrigin(origins="*",allowedHeaders ="*")
public class singerController {
	@Autowired
	private singerServ singerser;
	
	@GetMapping("/get/{id}")
	 public ResponseEntity<singer> getById(@PathVariable Integer id){
		  singer sg=singerser.findbyid(id);
		return new ResponseEntity<>(sg,HttpStatus.OK);
	 }
	 @PostMapping("/addsinger")
	 public ResponseEntity<String> createsinger(@RequestBody singer sin){
		  String status=singerser.upsert(sin);
		 return new ResponseEntity<>(status,HttpStatus.OK); 
	 }
	 
	 @GetMapping("/all")
	 public ResponseEntity<List<singer>> getAll() throws WriterException, IOException{
		 
		 List<singer> allsinger= singerser.getAll();
		 if(allsinger.size()!=0) {
			 for( singer sing:allsinger) {
				 QrCodeGenerated.generatedQRCode(sing);
			 }
		 }
		 return new ResponseEntity<>(allsinger,HttpStatus.OK);
	 }
	 @PutMapping("/update")
	 public ResponseEntity<String> updat(@RequestBody singer sin){
		 String udt=singerser.upsert(sin);
		 return new ResponseEntity<>(udt,HttpStatus.OK);
	 }
	
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<String> deletesinger(@PathVariable int id){
		  String status=singerser.deleteById(id);
		 return new ResponseEntity<>(status,HttpStatus.OK); 
	 }

}
