package composition;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;
    private final ArrayList<HourContract> contracts = new ArrayList<HourContract>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public double income(Integer year, Integer month) {
        double monthIncome = this.baseSalary;

        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            Date contractDate = contract.getDate();
            calendar.setTime(contractDate);
            int contractYear = calendar.get(Calendar.YEAR);
            int contractMonth = 1 + calendar.get(Calendar.MONTH);
            boolean isInSameYear = year.equals(contractYear);
            boolean isInSameMonth = month.equals(contractMonth);

            if (isInSameYear && isInSameMonth) {
                monthIncome += contract.totalValue();
            }
        }
        return monthIncome;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                ", contracts=" + contracts +
                '}';
    }
}
