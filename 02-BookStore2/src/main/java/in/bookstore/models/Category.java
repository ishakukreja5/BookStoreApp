package in.bookstore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Category {
	@Id
	@GeneratedValue(generator="cat_seq")
	@SequenceGenerator(name="cat_seq", initialValue=1111)      
    private Integer catid;
	private String category;
	private String description;
	

}
