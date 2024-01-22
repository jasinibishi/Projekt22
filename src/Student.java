class Student {// klasa
	int id;//data member (instancirana varijabla)
	String ime;//data member (instancirana varijabla)
	int starost;//data member(instancirana varijabla)
	
	Student (int i, String n) {// konstruktor so 2 parametri
		id = i;
		ime = n;
	}
	Student(int i, String n, int a) { //konstruktor so 3 parametri OVERLOADING
		id = i;
		ime= n;
		starost = a;
	}
	void display() {//metod
		System.out.println(id+""+ ime + "" + starost);
	}
	public static void main(String[]args) {
		Student s1 =new Student (111," Mal ",19);//kreiraj objekt s1
		Student s2 =new Student (222," Jasin ",20);//kreiraj objekt s2
		s1.display();//pecati s1
		s2.display();//pecati s2
	}
}