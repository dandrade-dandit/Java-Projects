
public class Rental {
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURLY_RENTRAL = 40;
	
	private String contractNumber;
	private int qtdHours;
	private int qtdExtraMinutes;
	private int price;
	
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
		
	}
	
	public void setHoursAndMinutes(int numberMinutesRental) {
		if (numberMinutesRental <= 60) {
			qtdHours = 1;
			qtdExtraMinutes = 0;
		} else {
			qtdHours = (numberMinutesRental/MINUTES_IN_HOUR);
			qtdExtraMinutes = (numberMinutesRental%MINUTES_IN_HOUR);
		}
		price = (qtdHours * HOURLY_RENTRAL) + (qtdExtraMinutes*1);
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public int getQtdHours() {
		return qtdHours;
	}

	public int getQtdExtraMinutes() {
		return qtdExtraMinutes;
	}

	public int getPrice() {
		return price;
	}

	Rental (String contractNumber,int numberMinutesRental) {
		setContractNumber(contractNumber);
		setHoursAndMinutes(numberMinutesRental);
	}
	
	Rental () {
		this ("A000", 0);
	}

}
