package LatihanPraktek04;

import LatihanPraktek03.Matakuliah;

public class TranskripNilaiMain {
	public static void main(String[] args) {
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
		Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
		
		KartuHasilStudi khs = new KartuHasilStudi("2022");
		khs.addMatakuliah(mk1);
		khs.addMatakuliah(mk2);
		khs.addMatakuliah(mk3);
		
		Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");
		
		TranskripNilai transkrip = new TranskripNilai(mhs);
		transkrip.addKHS(khs);
		transkrip.display();
	}
}
