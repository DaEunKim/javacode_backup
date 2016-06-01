package Classhw12;
/**
@version 1.30 2004-02-27
@author Cay Horstmann
*/

import java.util.*;

public class EmployeeSortTest
{  
public static void main(String[] args)
{  
   Employee[] staff = new Employee[3];

   staff[0] = new Employee(20071008,"Harry Hacker", 35000);
   staff[1] = new Employee(20010003,"Carl Cracker", 75000);
   staff[2] = new Employee(2004001,"Tony Tester", 38000);
   ArrayList staff = new ArrayList();

   Arrays.sort(staff);

   // print out information about all Employee objects
   Iterator <Employee> it = staff.iterator();
   
   while(it.hasNext()){
	   Employee e = it.next();
	   System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
	   }
   }
}

class Employee implements Comparable<Employee>
{  
private String name;
private double salary;

public int companyID;


public Employee(int compantID,String name, double salary)
{  
	this.companyID = companyID;
	this.name=name;
	this.salary=salary;
   
}

public String getName()
{  
   return name;
}

public double getSalary()
{  
   return salary;
}

public void raiseSalary(double byPercent)
{  
   double raise = salary * byPercent / 100;
   salary += raise;
}

/**
   Compares employees by salary
   @param other another Employee object
   @return a negative value if this employee has a lower
   salary than otherObject, 0 if the salaries are the same,
   a positive value otherwise
*/
public int compareTo(Employee other)
{  
   if (companyID < other.companyID) return -1;
   if (companyID > other.companyID) return 1;
   return 0;
}
}



