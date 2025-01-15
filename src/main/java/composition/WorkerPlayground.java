package composition;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WorkerPlayground {

    public static void main(String[] args) {
        String departmentName = getDepartmentName();
        String workerName = getWorkerName();
        WorkerLevel workerLevel = getWorkerLevel();
        double baseSalary = getBaseSalary();
        Worker worker = new Worker(workerName, workerLevel, baseSalary, new Department(departmentName));
        ArrayList<HourContract> contracts = getContracts();
        for (HourContract contract : contracts) {
            worker.addContract(contract);
        }

        double workerIncome = worker.income(2025, 1);
        System.out.println(worker);
        System.out.println("WORKER INCOME" + workerIncome);
    }

    public static String getDepartmentName() {
        Scanner departmentScanner = new Scanner(System.in);
        System.out.println("Type here the name of the department \n");
        return departmentScanner.nextLine();
    }

    public static String getWorkerName() {
        Scanner workerNameScanner = new Scanner(System.in);
        System.out.println("Type here the name of the worker \n");
        return workerNameScanner.nextLine();
    }

    public static WorkerLevel getWorkerLevel() {
        Scanner workerNameScanner = new Scanner(System.in);
        System.out.println("Type here the worker level (JUNIOR,MID, SENIOR)\n");
        return WorkerLevel.valueOf(workerNameScanner.nextLine());
    }

    public static double getBaseSalary() {
        Scanner baseSalaryScanner = new Scanner(System.in);
        System.out.println("Type here the worker base salary \n");
        return baseSalaryScanner.nextDouble();
    }

    public static ArrayList<HourContract> getContracts() {
        ArrayList<HourContract> contracts = new ArrayList<>();
        Scanner numberOfContractsScanner = new Scanner(System.in);
        System.out.println("Type here the number of contracts level \n");
        int numberOfContracts = numberOfContractsScanner.nextInt();
        for (int i = 0; i < numberOfContracts; i++) {
            int randomHours = (int) (Math.random() * i);
            HourContract contract = new HourContract(new Date(), 100, randomHours);
            contracts.add(contract);
        }

        return contracts;
    }

}
