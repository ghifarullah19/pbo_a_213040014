package LatihanPraktek04;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class TranskripNilai {
	private Date tglCetak;
	private double ipk = 0.0;
	private List<KartuHasilStudi> kartuHasilStudi;
	private Mahasiswa mahasiswa;
	
	public TranskripNilai(Mahasiswa mahasiswa) {
		super();
		this.mahasiswa = mahasiswa;
		kartuHasilStudi = new ArrayList<KartuHasilStudi>();
		tglCetak = new Date();
	}
	
	public void hitungIPK() {
		int jumlahIPS = 0;
		for (KartuHasilStudi khs : kartuHasilStudi) {
			khs.hitungIPS();
			ipk += khs.getIPS();
			jumlahIPS++;
		}
		ipk = ipk / jumlahIPS;
	}
	
	public void addKHS(KartuHasilStudi khs) {
		kartuHasilStudi.add(khs);
	}
	
	public void display() {
		System.out.println(mahasiswa.display());
		System.out.println("Tanggal Cetak: " + tglCetak.toString());
		hitungIPK();
		System.out.println("IPK: " + ipk);
		
		for (KartuHasilStudi khs : kartuHasilStudi) {
			System.out.println(khs.display());
		}
	}
}
