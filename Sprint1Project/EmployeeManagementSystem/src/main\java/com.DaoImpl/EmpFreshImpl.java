package com.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil;
import com.Dao.EmpFreshDao;
import com.Entity.EmployeeFresher;

public class EmpFreshImpl implements EmpFreshDao {

	public void CreateEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		System.out.println("Enter Employee Name :");
		String name = s.next();
		System.out.println("Enter Employee Work Location :");
		String loc = s.next();
		System.out.println("Enter Employee Phone No :");
		long phoneno = s.nextLong();
		System.out.println("Enter Employee Job Title :");
		String job = s.next();
		EmployeeFresher e = new EmployeeFresher();
		e.setEmpId(id);
		e.setName(name);
		e.setLocation(loc);
		e.setPhoneNo(phoneno);
		e.setEmpTitle(job);
		session.save(e);
		t.commit();
		System.out.println("Employee record inserted successfully");
		session.close();
	}
	
	
	public void UpdateEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		EmployeeFresher c = session.get(EmployeeFresher.class,id);
		System.out.println("Enter updated Employee Name :");
		String name = s.next();
		System.out.println("Enter updated Employee Work Location :");
		String loc = s.next();
		System.out.println("Enter updated Employee Phone No :");
		long phoneno = s.nextLong();
		System.out.println("Enter updated Employee Job Title :");
		String job = s.next();
		c.setName(name);
		c.setLocation(loc);
		c.setPhoneNo(phoneno);
		c.setEmpTitle(job);
		session.update(c);
		t.commit();
		System.out.println("Employee record updated successfully");
		session.close();
		
		
    }

	public void DeleteEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		EmployeeFresher k = session.get(EmployeeFresher.class,id);
		session.delete(k);
		t.commit();
		System.out.println("Employee record deleted successfully");
		session.close();
		
	}

	public void ShowEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Create EmpId :");
		int id = s.nextInt();
		EmployeeFresher w = session.get(EmployeeFresher.class,id);
		System.out.println(" Empid : " +w.getEmpId()+" Empname : " +w.getName()
		+" Emplocation : " +w.getLocation()+" Empphone : " +w.getPhoneNo()
		+" Empjob :" +w.getEmpTitle());
		
		
	}

}
