package com.abelhzo.bus.soap.orchestrate.service;

import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

public interface UsersOrchestrateService {
	
	public ResponseWrapper saveUserOP(InCommonHeader header, UserAddRQ rq);

	public ResponseWrapper updateUserOP(InCommonHeader header, UserUpdateRQ rq);
	
	public ResponseWrapper getUserOP(InCommonHeader header, Long iduser);
	
	public ResponseWrapper listUserOP(InCommonHeader header);

	public ResponseWrapper loginUserOP(InCommonHeader header, UserLoginRQ rq);

	public ResponseWrapper logoutUserOP(InCommonHeader header, UserLogoutRQ rq);

}
