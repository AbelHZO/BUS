package com.abelhzo.bus.soap.orchestrate.service;

import com.abelhzo.bus.soap.jaxws.CommonHeader;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

public interface UsersManagementOrchestrateService {

	public ResponseWrapper listUserOP(CommonHeader header);

	public ResponseWrapper getUserOP(CommonHeader header, Long iduser);

	public ResponseWrapper saveUserOP(CommonHeader header, UserAddRQ rq);

	public ResponseWrapper updateUserOP(CommonHeader header, UserUpdateRQ rq);

	public ResponseWrapper loginUserOP(CommonHeader header, UserLoginRQ rq);

	public ResponseWrapper logoutUserOP(CommonHeader header, UserLogoutRQ rq);
	
	public ResponseWrapper getRolOP(CommonHeader header, Long idrol);
	
	public ResponseWrapper listRolOP(CommonHeader header);
	
	public ResponseWrapper saveRolOP(CommonHeader header, RolesAddRQ rq);
	
	public ResponseWrapper updateRolOP(CommonHeader header, RolesUpdateRQ rq);

}
