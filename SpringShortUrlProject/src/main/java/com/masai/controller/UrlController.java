package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.urlException;
import com.masai.models.URLs;
import com.masai.services.URLService;

@RestController
public class UrlController {
	@Autowired
	private URLService urlService;
	
	@PostMapping("/short-url/create")
	public ResponseEntity<URLs> createUrlHandler(@RequestBody String url ) throws urlException{
		URLs urls =urlService.createUrls(url);
		return new ResponseEntity<URLs>(urls,HttpStatus.CREATED);
	}
	
	@GetMapping("/url/{shorturl}")
	public ResponseEntity<URLs> getUrlByIdHandler(@PathVariable("shorturl") Integer id) throws urlException{
		URLs url =urlService.getUrlById(id);
		return new ResponseEntity<URLs> (url,HttpStatus.OK);
	}
}
