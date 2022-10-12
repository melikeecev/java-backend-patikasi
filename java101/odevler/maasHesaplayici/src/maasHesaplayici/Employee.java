package maasHesaplayici;

public class Employee {
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		if(salary<1000) {
			return 0;
		}else {
			return salary*0.03;
		}
	}
	
	public double bonus(int workHours) {
		if(workHours>40) {
			return (workHours-40)*30;
		}else {
			return 0;
		}
	}
	
	public double raiseSalary(int hireYear) {
		if((2021-hireYear) < 10) {
			return salary*0.05;
		}else if((2021-hireYear)>9 || (2021-hireYear)<20) {
			return salary*0.10;
		}else {
			return salary*0.15;
		}
	}

	public void printInfo() {
		System.out.println("Adı: " + name);
		System.out.println("Maaşı: " + salary);
		System.out.println("Çalışma Saati: " + workHours);
		System.out.println("Başlangıç Yılı: " + hireYear);
		System.out.println("Vergi: " + tax(salary));
		System.out.println("Bonus: " + bonus(workHours));
		System.out.println("Maaş artışı: " + raiseSalary(hireYear));
		System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (salary + bonus(workHours) - tax(salary)));
		System.out.println("Toplam maaş: " + (salary + raiseSalary(hireYear)));
		
	}
}
