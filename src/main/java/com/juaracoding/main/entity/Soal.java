package com.juaracoding.main.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="soal")
public class Soal {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_soal;
	private String nama_soal;
	private String Status;
	
	
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name="id_soal", referencedColumnName = "id_soal")
	private List<Pertanyaan> pertanyaan = new ArrayList<Pertanyaan>();
	 
	 
//	 @OneToMany(cascade= CascadeType.ALL)
//	 @JoinTable(
//		        name = "nilai", 
//		        joinColumns = { @JoinColumn(name = "id_soal", referencedColumnName = "id_soal") })
//	 
//	 List<Pertanyaan> lstpertanyaan = new ArrayList<Pertanyaan>();


}
