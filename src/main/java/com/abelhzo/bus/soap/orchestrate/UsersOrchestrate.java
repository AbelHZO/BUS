package com.abelhzo.bus.soap.orchestrate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abelhzo.bus.soap.gateway.UsersGateway;
import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.bus.soap.orchestrate.service.UsersOrchestrateService;
import com.abelhzo.client.bus.commons.ConfigJAX;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.users.GetUserSOAP;
import com.abelhzo.client.bus.users.ListUserSOAP;
import com.abelhzo.client.bus.users.LoginUserSOAP;
import com.abelhzo.client.bus.users.LogoutUserSOAP;
import com.abelhzo.client.bus.users.SaveUserSOAP;
import com.abelhzo.client.bus.users.UpdateUserSOAP;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

@Service
public class UsersOrchestrate implements UsersOrchestrateService {

	@Autowired
	private UsersGateway usersGateway;

	@Override
	public ResponseWrapper saveUserOP(InCommonHeader header, UserAddRQ rq) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		 
		SaveUserSOAP saveUserSOAP = new SaveUserSOAP();
		saveUserSOAP.setConfigJAX(configJAX);
		saveUserSOAP.setUserAddRQ(rq);
		 
		ResponseWrapper response = usersGateway.saveUserOP(saveUserSOAP).getUserRS();
		
		return response;
	}

	@Override
	public ResponseWrapper updateUserOP(InCommonHeader header, UserUpdateRQ rq) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		UpdateUserSOAP updateUserSOAP = new UpdateUserSOAP();
		updateUserSOAP.setConfigJAX(configJAX);
		updateUserSOAP.setUserUpdateRQ(rq);
		
		ResponseWrapper response = usersGateway.updateUserOP(updateUserSOAP).getUserRS();
		
		return response;
	}

	@Override
	public ResponseWrapper getUserOP(InCommonHeader header, Long iduser) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		GetUserSOAP getUserSOAP = new GetUserSOAP();
		getUserSOAP.setConfigJAX(configJAX);
		getUserSOAP.setIduser(iduser);
		
		ResponseWrapper response = usersGateway.getUserOP(getUserSOAP).getUserRS();
		
		return response;
	}

	@Override
	public ResponseWrapper listUserOP(InCommonHeader header) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		ListUserSOAP listUserSOAP = new ListUserSOAP();
		listUserSOAP.setConfigJAX(configJAX);
		
		ResponseWrapper response = usersGateway.listUserOP(listUserSOAP).getUserRS();
		
		return response;
	}

	@Override
	public ResponseWrapper loginUserOP(InCommonHeader header, UserLoginRQ rq) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		LoginUserSOAP loginUserSOAP = new LoginUserSOAP();
		loginUserSOAP.setConfigJAX(configJAX);
		loginUserSOAP.setUserLoginRQ(rq);
		
		ResponseWrapper response = usersGateway.loginUserOP(loginUserSOAP).getUserRS();
		
		return response;
	}

	@Override
	public ResponseWrapper logoutUserOP(InCommonHeader header, UserLogoutRQ rq) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		LogoutUserSOAP logoutUserSOAP = new LogoutUserSOAP();
		logoutUserSOAP.setConfigJAX(configJAX);
		logoutUserSOAP.setUserLogoutRQ(rq);
		
		ResponseWrapper response = usersGateway.logoutUserOP(logoutUserSOAP).getUserRS();
		
		return response;
	}

}
