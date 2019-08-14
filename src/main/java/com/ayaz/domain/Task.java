package com.ayaz.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Fetch;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	@Temporal(TemporalType.TIMESTAMP)
	private Date insertDate;


	private String value;
	

	@ManyToOne()
	@JoinColumn(name = "PARENT_ID",referencedColumnName = "ID")
	private Parent parent;
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	

	public Task(Date insertDate, String value, Parent parent) {
		this.insertDate = insertDate;
		this.value = value;
		this.parent = parent;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", insertDate=" + insertDate + ", value=" + value + ", parent=" + parent + "]";
	}
	
	
	
}
