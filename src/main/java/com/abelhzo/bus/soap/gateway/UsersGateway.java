package com.abelhzo.bus.soap.gateway;

import com.abelhzo.client.bus.users.GetUserSOAP;
import com.abelhzo.client.bus.users.GetUserSOAPResponse;
import com.abelhzo.client.bus.users.ListUserSOAP;
import com.abelhzo.client.bus.users.ListUserSOAPResponse;
import com.abelhzo.client.bus.users.LoginUserSOAP;
import com.abelhzo.client.bus.users.LoginUserSOAPResponse;
import com.abelhzo.client.bus.users.LogoutUserSOAP;
import com.abelhzo.client.bus.users.LogoutUserSOAPResponse;
import com.abelhzo.client.bus.users.SaveUserSOAP;
import com.abelhzo.client.bus.users.SaveUserSOAPResponse;
import com.abelhzo.client.bus.users.UpdateUserSOAP;
import com.abelhzo.client.bus.users.UpdateUserSOAPResponse;

public interface UsersGateway {

	public SaveUserSOAPResponse saveUserOP(SaveUserSOAP saveUserSOAP);
	
	public UpdateUserSOAPResponse updateUserOP(UpdateUserSOAP updateUserSOAP);
	
	public GetUserSOAPResponse getUserOP(GetUserSOAP getUserSOAP);
	
	public ListUserSOAPResponse listUserOP(ListUserSOAP listUserSOAP);
	
	public LoginUserSOAPResponse loginUserOP(LoginUserSOAP loginUserSOAP);
	
	public LogoutUserSOAPResponse logoutUserOP(LogoutUserSOAP logoutUserSOAP);
	
}
