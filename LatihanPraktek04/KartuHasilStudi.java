package LatihanPraktek04;

import java.util.List;
import java.util.ArrayList;

import LatihanPraktek03.Matakuliah;

public class KartuHasilStudi {
	private String semester;
	private double ips;
	private List<Matakuliah> daftarMatakuliah;
	
	public KartuHasilStudi(String semester) {
		this.semester = semester;
		this.daftarMatakuliah = new ArrayList<>();
	}
	
	public void addMatakuliah(Matakuliah matakuliah) {
		daftarMatakuliah.add(matakuliah);
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		for (Matakuliah mk : daftarMatakuliah) {
			sb.append(mk.display());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void hitungIPS() {
		int sks = 0;
		for (Matakuliah mk : daftarMatakuliah) {
			ips += (mk.nilaiIndex() * mk.getSks());
			sks += mk.getSks();
		}
		ips = ips / sks;
	}
	
	public double getIPS() {
		return ips;
	}
}
