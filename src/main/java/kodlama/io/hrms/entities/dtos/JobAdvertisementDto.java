package kodlama.io.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private int jobAdvertisementId; 
	private int employerId;
	private int cityId;
    private String companyName;
    private String cityName;
    private String jobDescription;
    private Date applicationDeadline;
    private int openPositions;
    private boolean isActive;
	
	
}
