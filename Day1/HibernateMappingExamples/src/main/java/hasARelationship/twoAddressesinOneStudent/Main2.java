package hasARelationship.twoAddressesinOneStudent;

import javax.persistence.EntityManager;

import com.masai.EMUtils;

public class Main2 {
public static void main(String[] args) {

EntityManager em = EMUtils.provideEntityManager();

Student st=new Student();
st.setMarks(500);
st.setSname("Raman");
Address homeadr= new Address("Delhi", "Delhi", "112200");

Address officeAdr = new Address("Gurgaon", "UP", "125005");

st.setHomeaddr(homeadr);
st.setOfficeaddr(officeAdr);

em.getTransaction().begin();

em.persist(st);

em.getTransaction().commit();

System.out.println("done....");
em.close();
	}
}
