package com.demo.ssh.dao;

import com.demo.ssh.bean.Book;

public interface BookDao {
	void save(Book book);
	
	int getBook();
}
