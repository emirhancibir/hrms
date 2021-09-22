package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "user_id" , referencedColumnName = "id")
public class Employee extends User {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
}
