package com.juaracoding.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.juaracoding.main.entity.Dosen;
import com.juaracoding.main.entity.Mahasiswa;
import com.juaracoding.main.entity.Matkul;
import com.juaracoding.main.entity.Pertanyaan;
import com.juaracoding.main.entity.PlotMatkul;
import com.juaracoding.main.entity.Soal;
import com.juaracoding.main.repository.MatkulRepository;
import com.juaracoding.main.repository.PertanyaanRepository;
import com.juaracoding.main.repository.PlotMatkulRepository;
import com.juaracoding.main.repository.SoalRepository;
import com.juaracoding.main.repository.DosenRepository;
import com.juaracoding.main.repository.MahasiswaRepository;


@SpringBootApplication
public class UjianEmpatApplication implements CommandLineRunner {
	
	@Autowired
	SoalRepository soalRepository;
	
	
	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Autowired
	MatkulRepository matkulRepository;
	
	@Autowired
	DosenRepository dosenRepository;
	
	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	PlotMatkulRepository plotmatkulRepository;

	public static void main(String[] args) {
		SpringApplication.run(UjianEmpatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		Dosen dosen = new Dosen();
		dosen.setNama_dosen("Naruto");
		dosen.setUsername("Naruto");
		dosen.setPassword("12345");
//		this.dosenRepository.save(dosen);
		
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNama_mahasiswa("Boruto");
		mahasiswa.setJenis_kelamin("Cowo");
		mahasiswa.setPassword("Shinobi");
//		this.mahasiswaRepository.save(mahasiswa);
		
		Matkul matkul = new Matkul();
		matkul.setNama_matkul("Manga");
//		this.matkulRepository.save(matkul);
		
		PlotMatkul plotmatkul = new PlotMatkul();	

		List <PlotMatkul> lstplotmatkul = new ArrayList<PlotMatkul>();
		lstplotmatkul.add(plotmatkul);
		
		dosen.setPlotmatkul(lstplotmatkul);
		this.dosenRepository.save(dosen);
		
//		mahasiswa.setPlotmatkul(lstplotmatkul);
		this.mahasiswaRepository.save(mahasiswa);
		
//		matkul.setPlotmatkul(lstplotmatkul);	
		this.matkulRepository.save(matkul);
		
		
		
		Soal soal = new Soal();
		soal.setNama_soal("MTK");
		soal.setStatus("pilihan ganda");
		
		
		Pertanyaan pertanyaan = new Pertanyaan();
		pertanyaan.setPertanyaan("1+1 = ?");
		pertanyaan.setJawaban_1("a. 11");
		pertanyaan.setJawaban_2("b. 2");
		pertanyaan.setJawaban_3("c. Benar Semua");
		pertanyaan.setJawaban_benar("b. 2");
		pertanyaan.setGambar("Gambar");
		pertanyaan.setStatus_gambar("Gambar Soal");
		
		List <Pertanyaan> lstpertanyaan = new ArrayList<Pertanyaan>();
		lstpertanyaan.add(pertanyaan);
		
		soal.setPertanyaan(lstpertanyaan);
		this.soalRepository.save(soal);
		
		List<Soal> lstsoal = new ArrayList<Soal>();
		lstsoal.add(soal);
		plotmatkul.setPlotmatkul(lstsoal);
		this.plotmatkulRepository.save(plotmatkul);
		
	}

}
