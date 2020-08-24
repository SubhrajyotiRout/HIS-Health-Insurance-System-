package com.subhra.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="USER_ACCOUNTS")
@Data

public class UserAccountsEntity {
	
	@Id

	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="FIRST_NAME")
	private String fname;
	
	@Column(name="LAST_NAME")
	private String lname;
	
	@Column(name="EMAIL_ID")
	private String email;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="USER_PASSWORD")
	private String pwd;
	
	@Column(name="CREATED_DATE", updatable=false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="UPDATED_DATE", insertable=false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;

}
