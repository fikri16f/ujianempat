package com.juaracoding.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name="Plot_matkul")
public class PlotMatkul {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_plot_mk;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_plot_mk", referencedColumnName ="id_plot_mk")
	private List<Soal> plotmatkul = new ArrayList<Soal>();
	
	

}
