package com.demo.app.demoTest;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter @Setter @NoArgsConstructor 
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Set<Post> posts;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="location_id")
	private Location location;
	@OneToOne
	private ConfirmCode confirmCode;
	
	
	
}
