package fr.innso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;










import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;











import fr.innso.dao.DossierClientRepository;
import fr.innso.dao.MessageRepository;
import fr.innso.entities.Canal;
import fr.innso.entities.DossierClient;
import fr.innso.entities.Message;


@SpringBootApplication
public class AppApplication {


	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	//	Création de Message

	public static Message messagem = new Message();
	public static DossierClient dossierClientt =new DossierClient();
	public static List<Message> messagesm = new ArrayList<Message>();
	public static List<DossierClient> dossierClients = new ArrayList<DossierClient>();
	// Creation de dossier Client
	@Bean
	CommandLineRunner testenregistreDossierClient(DossierClientRepository dc){	
		messagesm.add(messagem);
		dossierClientt = new DossierClient(1L, "Jérémie Durand", new Date(), null, messagesm);
		return args->dc.save(dossierClientt);

	}
	// Creation de message de Jérémie
	@Bean
	CommandLineRunner testenregistreMessageDurand(MessageRepository msg){	
		messagem = new Message(1L, new Date(),"Jérémie Durand","Bonjour, j’ai un problème avec mon nouveau téléphone",Canal.Mail,new DossierClient(1L));
		return args->msg.save(messagem);

	}

	// Creation de message de Sonia
	@Bean
	CommandLineRunner testenregistreMessageValentin(MessageRepository msg){	
		return args->msg.save(new Message(2L, new Date(),"Sonia Valentin","Je suis Sonia, et je vais mettre tout en œuvre pour vous aider. Quel est le modèle de votre téléphone ?", Canal.Mail,new DossierClient(1L)));

	}


}
