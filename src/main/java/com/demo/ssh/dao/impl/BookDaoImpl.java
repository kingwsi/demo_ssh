package com.demo.ssh.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.demo.ssh.bean.Book;
import com.demo.ssh.dao.BookDao;

@Repository
@Transactional()
public class BookDaoImpl implements BookDao {
	
	private HibernateTemplate template;
	
    @Autowired
    public BookDaoImpl(SessionFactory sessionFactory) {
        this.template = new HibernateTemplate(sessionFactory);
    }

    @Override
	public void save(Book book) {
		template.save(book);
	}

	@Override
	public int getBook() {
		return template.getMaxResults();
	}
}
