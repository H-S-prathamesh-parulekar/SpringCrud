package in.prathamesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private String  name;
	private  String email;
	private Long phone;

}
