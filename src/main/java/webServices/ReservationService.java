package webServices;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

import dao.Database;
import entities.Reservation;

@Path("reservation")
public class ReservationService {
	@EJB
	Database db;

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Reservation> getAllReservations() {
		
		return db.getAllReservations();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Reservation getReservation(@PathParam("id") int id) {
		return db.getReservation(id);
	}
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createReservation(Reservation newRes) {
		db.addReservation(newRes);
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void editReservation(@PathParam("id") int id, Reservation newRes) {
		db.removeReservation(id);
		db.addReservation(newRes);
	}
	
	@DELETE
	@Path("/{id}")
	public void deleteReservation(@PathParam("id") int id) {
		db.removeReservation(id);
	}
}
