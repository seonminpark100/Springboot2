package myjpa3;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UseMember02_select {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager em = emf.createEntityManager();
	//	EntityTransaction transaction = em.getTransaction();
		
		Member3 member3 = em.find(Member3.class, "hong@spring.com");
		System.out.println("member3="+ member3);
		
		if (member3 != null) {
			System.out.println("이름:"+ member3.getName());
			System.out.println("날짜:"+ member3.getCreateDate());
		} else {
			System.out.println("존재하지 않습니다.");
		}
		em.close();
		emf.close();
	}
}
