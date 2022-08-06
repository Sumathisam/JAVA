package com.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil;
import com.Dao.EmpSalDao;
import com.Entity.EmployeeSalary;

public class EmpSalImpl implements EmpSalDao {

	public void CreateSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		System.out.println("Enter Employee Name :");
		String name = s.next();
		System.out.println("Enter Employee Basic Salary :");
		double bs = s.nextDouble();
		System.out.println("Enter Employee Monthly Salary :");
		double ms = s.nextDouble();
		double annual = ms*12;
		EmployeeSalary e = new EmployeeSalary();
		e.setEmpId(id);
		e.setName(name);
		e.setBasicSalary(bs);
	    e.setMonthlySalary(ms);
	    e.setAnnualSalary(annual);
	    session.save(e);
		t.commit();
		System.out.println("Salary record inserted successfully");
		session.close();
	}
		

	public void UpdateSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter EmpId :");
		int id = s.nextInt();
		EmployeeSalary d = session.get(EmployeeSalary.class, id);
		System.out.println("Enter Updated Employee Name :");
		String uname = s.next();
		System.out.println("Enter Updated Employee Basic Salary :");
		double ubs = s.nextDouble();
		System.out.println("Enter Updated Employee Monthly Salary :");
		double ums = s.nextDouble();
		double uannual = ums*12;
		d.setName(uname);
		d.setBasicSalary(ubs);
		d.setMonthlySalary(ums);
		d.setAnnualSalary(uannual);
		session.update(d);
		t.commit();
		System.out.println("Salary record updated successfully");
		session.close();
	}
		
		

	public void DeleteSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		EmployeeSalary k = session.get(EmployeeSalary.class, id);
		session.delete(k);
		t.commit();
		System.out.println("Salary record deleted successfully");
		session.close();
		
		
	}

	public void ShowSal() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		EmployeeSalary j = session.get(EmployeeSalary.class, id);
		System.out.println(" Empid : " +j.getEmpId()+" Empname : " +j.getName()
		+" Empbasicsalary : " +j.getBasicSalary()+" Empmonthlysalary : " +j.getMonthlySalary()
		+" Empannualsalary :" +j.getAnnualSalary());
		
		
		}

}
