package com.demo.ssh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author wangshuccc
 *
 */
@Entity
@Table(name = "book", catalog = "ssh")
public class Book {

	@Id
	@GeneratedValue(generator = "id")
    @GenericGenerator(name = "id", strategy = "native")
	private Integer id;

	@Column(length = 20)
	private String name;

	private String author;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(Integer id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}
