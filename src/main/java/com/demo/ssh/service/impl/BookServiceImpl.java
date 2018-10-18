package com.demo.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ssh.bean.Book;
import com.demo.ssh.dao.BookDao;
import com.demo.ssh.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public void saveBook(Book book) {
		bookDao.save(book);
	}


	@Override
	public int getResultMax() {
		return bookDao.getBook();
	}
	

}
