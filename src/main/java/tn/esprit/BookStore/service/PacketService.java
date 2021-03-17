package tn.esprit.BookStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.BookStore.model.Book;
import tn.esprit.BookStore.model.Packet;
import tn.esprit.BookStore.model.User;
import tn.esprit.BookStore.repository.PacketRepository;

@Service
public class PacketService {
	@Autowired
	private PacketRepository Pkr;
	public List<Object[]> ListerLesBookBypacket(){
		return Pkr.NumberBookGroupedByPacket();
	}
	
	public List<Packet> getAll() {
		return Pkr.findAll();
	}
public String Add(Packet pk) {
	Packet pkt=Pkr.saveAndFlush(pk);
	if(pkt != null) {
		return "Packet Ajoutee avec Success";
	}
	return "erreur Ajout Packet";
}


public String Delete(long id) {
	// TODO Auto-generated method stub
	


Pkr.deleteById(id);
return "packet Removed";
 
}
}
