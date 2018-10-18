package com.demo.ssh.service;

import com.demo.ssh.bean.Book;

public interface BookService {
	
	void saveBook(Book book);
	
	int getResultMax();

}
