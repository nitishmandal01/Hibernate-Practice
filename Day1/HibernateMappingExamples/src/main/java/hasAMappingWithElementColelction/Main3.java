package hasAMappingWithElementColelction;

import javax.persistence.EntityManager;

import com.masai.EMUtils;

public class Main3 {
public static void main(String[] args) {
	EntityManager em = EMUtils.provideEntityManager();
	
	Employee emp = new Employee();
	emp.setGender("Male");
	emp.setName("Ram");
	emp.setSalary(75000);
	
	emp.getEmpAddress().add(new Address("UP", "NOIDA", "12033", "Home"));
	emp.getEmpAddress().add(new Address("Delhi", "Delhi", "122005", "Office"));
	
	Employee emp2 = new Employee();
	emp2.setGender("Female");
	emp2.setName("Radha");
	emp2.setSalary(75000);
	
	emp2.getEmpAddress().add(new Address("MP", "Bhopal", "852", "Home"));
	emp2.getEmpAddress().add(new Address("Delhi", "Delhi", "85245", "Office"));
	
	
	Employee emp3 = new Employee();
	emp3.setGender("Male");
	emp3.setName("Nitish");
	emp3.setSalary(75000);
	
	emp3.getEmpAddress().add(new Address("HR", "FBD", "121004", "Home"));
	emp3.getEmpAddress().add(new Address("Delhi", "Delhi", "122005", "Office"));
	
	
	em.getTransaction().begin();

	em.persist(emp3);
	em.persist(emp2);
	em.persist(emp);
	
	em.getTransaction().commit();
	System.out.println("Done....");
	
	em.close();
}
}
