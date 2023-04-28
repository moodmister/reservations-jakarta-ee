package dao;

import entities.Reservation;
import java.util.ArrayList;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Stateless
public class Database
{
	@PersistenceContext(unitName ="JPADefaultDataBaseConnection")
	private EntityManager em;

	public void addReservation(Reservation reservation)
	{
			em.persist(reservation);
	}
	
	public Reservation getReservation(int id) {
		ArrayList<Reservation> allRes = this.getAllReservations();
		Reservation resultRes = new Reservation();
		for (Reservation res : allRes) {
			if (res.getId() == id) {
				resultRes = res;
			}
		}
		return resultRes;
	}
	
	public ArrayList<Reservation> getAllReservations() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Reservation> cq = cb.createQuery(Reservation.class);
		Root<Reservation> rootEntry = cq.from(Reservation.class);
		CriteriaQuery<Reservation> all = cq.select(rootEntry);
	    TypedQuery<Reservation> allQuery = em.createQuery(all);
		return (ArrayList<Reservation>) allQuery.getResultList();
	}
	
	public void removeReservation(int id) {
		ArrayList<Reservation> allRes = this.getAllReservations();
		Reservation deleteRes = new Reservation();
		for (Reservation res : allRes) {
			if (res.getId() == id) {
				deleteRes = res;
			}
		}
		em.remove(deleteRes);
	}
}
