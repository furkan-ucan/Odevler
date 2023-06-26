package SalaryCalculator;

public class Employee {
    String name;    // name of the employee
    double salary;  // salary of the employee
    int workHours;  // work hours of the employee
    int hireYear;   // hire year of the employee


    // constructor
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {   // if the salary is less than 1000, there is no tax
            return 0;
        } else {    // if the salary is greater than or equal to 1000, there is a tax
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {  // if the work hours is greater than 40, there is a bonus
            return (this.workHours - 40) * 30;
        } else {    // if the work hours is less than or equal to 40, there is no bonus
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021; // current year
        int workingYear = currentYear - this.hireYear; // calculate the number of years the employee has worked
        if (workingYear < 10) { // if the employee has worked less than 10 years, there is a raise
            return this.salary * 0.05;
        } else if (workingYear >= 10 && workingYear < 20) { // if the employee has worked between 10 and 20 years, there is a raise
            return this.salary * 0.10;
        } else {    // if the employee has worked more than 20 years, there is a raise
            return this.salary * 0.15;
        }
    }

    public String toString() {
        return "Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHours + "\nBaşlangıç Yılı : " + this.hireYear + "\nVergi : " + this.tax() + "\nBonus : " + this.bonus() + "\nMaaş Artışı : " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()) + "\nToplam Maaş : " + (this.salary + this.bonus() + this.raiseSalary() - this.tax());
    }

    
}
