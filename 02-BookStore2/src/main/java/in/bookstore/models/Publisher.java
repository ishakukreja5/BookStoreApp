package in.bookstore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Publisher {
       @Id
       @GeneratedValue(generator="pub_seq")
   	   @SequenceGenerator(name="pub_seq", initialValue=111)
	   private Integer publid;
	   private String publisher;
	   private String phone;
	   private String address;
	   private String email;
}
