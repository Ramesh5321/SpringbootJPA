package com.app.SpringbootJpaRepository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long perId;
	@NotNull
	@Size(min=2,max=30)
	@Column
	private String perName;
	@Column
	@Email
	private String perEmail;
	public Long getPerId() {
		return perId;
	}
	public void setPerId(Long perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public String getPerEmail() {
		return perEmail;
	}
	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
