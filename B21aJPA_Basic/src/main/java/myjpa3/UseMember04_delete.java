package myjpa3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UseMember04_delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			Member3 member3 = em.find(Member3.class, "hong@spring.com");
			if (member3 == null) {
				System.out.println("존재하지 않습니다.");
				transaction.rollback();
				return;
			}
			em.remove(member3);
			transaction.commit();
			System.out.println("삭제되었습니다.");
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		}
			em.close();
			emf.close();
	}
}
