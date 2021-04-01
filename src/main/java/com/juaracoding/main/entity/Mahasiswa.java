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
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long nim;
	private String nama_mahasiswa;
	private String jenis_kelamin;
	private String password;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "nim", referencedColumnName ="nim")
	private List<PlotMatkul> plotmatkul = new ArrayList<PlotMatkul>();

}
