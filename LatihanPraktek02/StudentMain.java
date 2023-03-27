package LatihanPraktek02;

public class StudentMain {
	public static void main(String[] args) {
		Student x = new Student();
		Student y = x;
		
		x.setNrp("01");
		y.setNrp("02");
		
		System.out.println(x.getNrp());
		
		Student z = new Student();
		
		z.setNrp("03");
		x = z;
		
		System.out.println(x.getNrp());
		System.out.println(y.getNrp());
	}
}
