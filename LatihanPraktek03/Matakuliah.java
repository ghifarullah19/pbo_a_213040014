package LatihanPraktek03;

public class Matakuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	public Matakuliah(String kode, String nama, String index, int sks) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	}
	
	public double nilaiIndex() {
		// Berdasarkan index matakuliah
		// A = 4, AB = 3.5, B = 3, BC = 2.5, C = 2, D = 1, E = 0
		if (this.index.equals("A")) {
			return 4;
		} else if (this.index.equals("AB")) {
			return 3.5;
		} else if (this.index.equals("B")) {
			return 3;
		} else if (this.index.equals("BC")) {
			return 2.5;
		} else if (this.index.equals("C")) {
			return 2;
		} else if (this.index.equals("D")) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String display() {
		return kode + " - " + nama + " - " + index;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}
}
