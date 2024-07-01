package account.mine;

import java.io.Serializable;

import lombok.Data;

@Data
public class Spend implements Serializable{

	private static final long serialVersionUID = 12345L;
	
	private int money;
	private String account, option, date;
	
	
	public Spend(String date, String option, int money, String account) {
		
		this.option = option;
		this.money = money;
		this.account = account;
		this.date = date;
		
	}
	
	

}
