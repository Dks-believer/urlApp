package com.masai.services;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.urlException;
import com.masai.models.URLs;
import com.masai.repository.URLDao;

import net.bytebuddy.utility.RandomString;

@Service
public class URLServiceImpl implements URLService{
	
	@Autowired
	private URLDao uDao;
	
	@Override
	public URLs createUrls(String url) throws urlException {
		
		String random = RandomString.make(7);
		
		URLs urls = new URLs();
		urls.setActualUrl(url);
		
		urls.setShortUrl(url+random);
		
		Date date = new Date();
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.DAY_OF_WEEK, 7);

	            java.util.Date expirationDate = cal.getTime();

	    System.err.println(expirationDate);
	    
		urls.setExpiry(expirationDate);
		
		return urls;
	}

	@Override
	public URLs getUrlById(Integer id) throws urlException {
		
		URLs url =uDao.findById(id).orElseThrow(() -> new urlException("Enter Proper ID : Id does not exist..."));
		return url;
	}

}
