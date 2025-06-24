package myjpa4;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Use02_TypedQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			
			String SQL = "SELECT m FROM Member4 m ORDER BY m.name";
			TypedQuery<Member4> query = em.createQuery(SQL, Member4.class);
			List<Member4> result = query.getResultList();
			
			transaction.commit();
			if (result.isEmpty()) {
				System.out.println("레코드가 없습니다.");
			} else {
				result.forEach(user ->
					System.out.printf("| %s | %s | %tY-%<tm-%<td |\n", user.getEmail(), user.getName(), user.getCreateDate()));	
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		em.close();
		emf.close();
	}
}
