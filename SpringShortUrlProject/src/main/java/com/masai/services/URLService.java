package com.masai.services;

import org.springframework.stereotype.Service;

import com.masai.exceptions.urlException;
import com.masai.models.URLs;

public interface URLService {

	public URLs createUrls(String url) throws urlException;
	
	public URLs getUrlById(Integer id) throws urlException;
}
