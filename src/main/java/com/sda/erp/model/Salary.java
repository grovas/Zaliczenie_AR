package com.sda.erp.model;

/* Created by Artur Rózgowski on 3/18/17 */
public class Salary implements IntSalary {

    private float salary;

    public float getSalary() {
        return salary;
    }

    private Person person;

    public Salary(float salary) {
        this.salary = salary;
    }

    public void setSalary(float salary) {
        if (this.person.isMarital())
            this.salary = this.salary * 0.97F;
        this.salary = salary;
    }

    /*
* obliczanie podwyżki // procedura z parametrem, który określa procent podniesienia pensji –
* dodatkowo, za każde dziecko pracownika zwiększa mu się pensję o 2 procent,
* natomiast pracownicy będący w formalnym związku dodatkowo dostają 3 procent podwyżki) ;*/

    public void setSalaryRaise (float rise) {
        float percent = 0;

        percent = (rise * 100) / this.salary;

        if (this.person.isMarital()) percent = percent + 3;

        percent = percent + 2 * this.salary;

        System.out.println("Pensja podwyższona o procent: " + percent);

        this.salary = this.salary + percent*this.salary/100;
    }

    public boolean salaryValue (float sal) {
        if (sal > this.salary) return true;
        else return false;
    }
}
