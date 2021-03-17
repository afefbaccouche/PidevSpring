package tn.esprit.BookStore;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.BookStore.model.User;
import tn.esprit.BookStore.repository.UserRepository;
import tn.esprit.BookStore.service.IUserService;


@SpringBootTest
@RunWith(SpringRunner.class)
class BookStoreApplicationTests {
@Autowired
IUserService Srv;
@Autowired
UserRepository repo;
	/*@Test
	void testAjouterEntreprise()
	{
		User e=new  User("nourhene", "nourhene", 44654,"nourhene","nourhene",0) ;
		Srv.Signup(e);
	}*/
	
	@Test
	void test()
	{
		
String x=Srv.VerifyMyaccount(new  User("hello", "mohamed.derbali@esprit.tn", 12346545,"hama4","$2a$10$k5pVsPwUmyz/5rCcMwMeNe8XXzne6F2ILFNCHeB/fqAeeArw8IJlu",1), "$2a$10$..og9eiMHqeEI7J8DQb8hOuHgljvoYez19ACbzG/q03a92agutn1m");
		System.out.println(x);

	}
}
