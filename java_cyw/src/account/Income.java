package account;

import java.io.Serializable;

import lombok.Data;

@Data
public class Income implements Serializable{

	private static final long serialVersionUID = 12345L;
	
	private int money;
	private String account, option, date;
	
	
	public Income(String date, String option, int money, String account) {
		
		this.money = money;
		this.account = account;
		this.option = option;
		this.date = date;
		
	}
	
	

}
