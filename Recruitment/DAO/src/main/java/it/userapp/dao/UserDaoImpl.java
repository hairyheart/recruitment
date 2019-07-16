package it.userapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import it.userapp.entity.User;


@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDaoImpl() {

	}
	
	public void addUser(User user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
	}
	

	public List<User> findAll() {
		Session currentSession= entityManager.unwrap(Session.class);
		Query<User> theQuery=
				currentSession.createQuery("from User", User.class);
		List<User> allUser = theQuery.getResultList();
		return allUser;
	}


}
