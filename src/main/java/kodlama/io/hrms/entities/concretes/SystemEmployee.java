package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Table(name="systememployees")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
//@PrimaryKeyJoinColumn(name="candidate_id", referencedColumnName = "id")
public class SystemEmployee extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="systememployee_id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name="last_name")
	private String lastName;

}
