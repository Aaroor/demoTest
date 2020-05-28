package com.demo.app.demoTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter @Getter @NoArgsConstructor
@ToString
public class ConfirmCode {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String code;
	@OneToOne(mappedBy = "confirmCode")
	private User user;
	
}
