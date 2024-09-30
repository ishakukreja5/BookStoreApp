package in.bookstore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue(generator="book_seq")
	@SequenceGenerator(name="book_seq", initialValue=11111)
   private Integer bookid;
   private String title;
   private String author;
   private String category;
   private String publisher;
   private Integer copies;
   private Integer price;
}
