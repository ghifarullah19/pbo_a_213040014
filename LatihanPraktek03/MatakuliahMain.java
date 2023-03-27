package LatihanPraktek03;

public class MatakuliahMain {
	public static void main(String[] args) {
		// Create objek matakuliah
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
		Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
		
		// Tampilkan daftar matakuliah
		System.out.println("--- DAFTAR MATAKULIAH ---");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());
		
		System.out.println("--- Nilai IPK ---");
		// Bagaimana hitung IPK?
		// Rumus: (index nilai * sks) + (index nilai * sks) + .. + (index nilai * sks) / total_sks
		double IPK = ((mk1.nilaiIndex() * mk1.getSks()) + (mk2.nilaiIndex() * mk2.getSks()) + (mk3.nilaiIndex() * mk3.getSks())) /  (mk1.getSks() + mk2.getSks() + mk3.getSks());
		System.out.println(IPK);
	}
}
