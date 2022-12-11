package com.chatter.app.enitty;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="USERS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity implements Serializable {
	
	@Column(name="F_NAME")
	@NotBlank(message="First Name cannot be blank")
	@NotNull(message="First Name cannot be null")
	private String fname;
	
	@Column(name="L_NAME")
	private String lname;
	
	@Column(name="EMAIL")
	@NotBlank(message="E-mail cannot be blank")
	@Email(message="Not a valid email")
	private String email;
	
	@Id
	@Column(name="PHONE_NO_PK")
	@NotNull(message="Phone No. cannot be null")
	private Integer mob;
	

}
