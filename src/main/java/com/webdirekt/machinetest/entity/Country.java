package com.webdirekt.machinetest.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Entity
@Table(name="Country")
@Getter
@Setter
@NoArgsConstructor
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	
	@Column
	private String countryName;

}
