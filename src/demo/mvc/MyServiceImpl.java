package demo.mvc;

import java.util.Date;

public class MyServiceImpl implements MyService {
	
	private String accountname = "Ann Jones";
	private double balance  = 4000;

	public String getMessage() {
		String result = String.format("Name = %s, Balance = %.2f", accountname, balance);
		return result;
	}

	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return new Date();
	}
}
