package com.demo.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.demo.ssh.bean.Book;
import com.demo.ssh.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class BookAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private BookService bookService;
	
	private String bname;
	
	private String author;
	
	public String save() {
		Book book = new Book(null, bname, author);
		bookService.saveBook(book);
		this.addActionMessage("save success!");
		return SUCCESS;
	}
	
	public String select() {
		int resultMax = bookService.getResultMax();
		System.out.println(resultMax);
		return NONE;
	}
	
	public String defa() {
		return SUCCESS;
	}

	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}

	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
