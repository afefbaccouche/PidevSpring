package tn.esprit.BookStore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Packet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String titre;
private String objective;
@OneToMany(targetEntity=Book.class, mappedBy="pkt",cascade=CascadeType.ALL, fetch = FetchType.LAZY)    
private List<Book> booklist = new ArrayList<>();
public Packet( String titre, String objective) {
	super();
	this.titre = titre;
	this.objective = objective;

}
public Packet() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getObjective() {
	return objective;
}
public void setObjective(String objective) {
	this.objective = objective;
}


} 
