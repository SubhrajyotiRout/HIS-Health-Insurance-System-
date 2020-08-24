package com.subhra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ROLE_MASTER")
@Data
public class UserRoleEntity {

	@Id
	@Column(name="ROLE_ID")
	private Integer roleid;
	
	@Column(name="ROLE_NAME")
	private String rolename;
}
