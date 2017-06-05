package com.abelhzo.bus.soap.transformer;

import javax.xml.bind.JAXBElement;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.abelhzo.client.bus.users.GetUserSOAPResponse;
import com.abelhzo.client.bus.users.ListUserSOAPResponse;
import com.abelhzo.client.bus.users.LoginUserSOAPResponse;
import com.abelhzo.client.bus.users.LogoutUserSOAPResponse;
import com.abelhzo.client.bus.users.SaveUserSOAPResponse;
import com.abelhzo.client.bus.users.UpdateUserSOAPResponse;

@Component("usersTransformer")
public class UsersTransformer {
	
	@Transformer
	public SaveUserSOAPResponse responseSaveUser(JAXBElement<SaveUserSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public UpdateUserSOAPResponse responseUpdateUser(JAXBElement<UpdateUserSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public GetUserSOAPResponse responseGetUser(JAXBElement<GetUserSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public ListUserSOAPResponse responseListUser(JAXBElement<ListUserSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public LoginUserSOAPResponse responseLoginUser(JAXBElement<LoginUserSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public LogoutUserSOAPResponse responseLogoutUser(JAXBElement<LogoutUserSOAPResponse> jaxb) {
		return jaxb.getValue();
	}

}
