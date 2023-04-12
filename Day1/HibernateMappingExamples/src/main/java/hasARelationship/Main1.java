package hasARelationship;

import javax.persistence.EntityManager;

import com.masai.EMUtils;

public class Main1 {
public static void main(String[] args) {
		EntityManager em = EMUtils.provideEntityManager();
		
//		Employee emp = new Employee();
//		emp.setEname("Nitish");
//		emp.setSalary(70000);
//		
//		Address ad = new Address();
//		ad.setCity("FBD");
//		ad.setPincode("121004");
//		ad.setState("HR");
//		
//		emp.setAddr(ad);
//		
//		em.getTransaction().begin();
//		
//		em.persist(emp);
//		
//		em.getTransaction().commit();	
		
		
		Employee employee = em.find(Employee.class, 1);
		System.out.println(employee.getAddr());
		
//		em.close();
	}
}
