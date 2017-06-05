package com.abelhzo.bus.soap;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.bus.soap.orchestrate.service.UsersOrchestrateService;
import com.abelhzo.bus.soap.service.UserService;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

@WebService(serviceName = "UsersServiceBUS", 
			endpointInterface = "com.abelhzo.bus.soap.service.UserService", 
			portName = "UsersServicePortBUS", 
			targetNamespace = "http://abelhzo.bus/users/")
public class User extends SpringBeanAutowiringSupport implements UserService {
	
	@Autowired
	private UsersOrchestrateService usersOrchestrateService;

	@Override
	public ResponseWrapper saveUserOP(InCommonHeader header, UserAddRQ rq) {
		return usersOrchestrateService.saveUserOP(header, rq);
	}

	@Override
	public ResponseWrapper updateUserOP(InCommonHeader header, UserUpdateRQ rq) {
		return usersOrchestrateService.updateUserOP(header, rq);
	}

	@Override
	public ResponseWrapper listUserOP(InCommonHeader header) {
		return usersOrchestrateService.listUserOP(header);
	}

	@Override
	public ResponseWrapper getUserOP(InCommonHeader header, Long iduser) {
		return usersOrchestrateService.getUserOP(header, iduser);
	}

	@Override
	public ResponseWrapper loginUserOP(InCommonHeader header, UserLoginRQ rq) {
		return usersOrchestrateService.loginUserOP(header, rq);
	}

	@Override
	public ResponseWrapper logoutUserOP(InCommonHeader header, UserLogoutRQ rq) {
		return usersOrchestrateService.logoutUserOP(header, rq);
	}

}
