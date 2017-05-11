package com.abelhzo.bus.soap;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.abelhzo.bus.soap.jaxws.CommonHeader;
import com.abelhzo.bus.soap.orchestrate.service.UsersManagementOrchestrateService;
import com.abelhzo.bus.soap.service.UsersManagementServiceBUS;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

@WebService(serviceName = "UsersManagementServiceBUS", 
			endpointInterface = "com.abelhzo.bus.soap.service.UsersManagementServiceBUS", 
			portName = "UsersManagementServicePort", 
			targetNamespace = "http://abelhzo.bus/usersmanagement/")
public class UsersManagementBUS extends SpringBeanAutowiringSupport implements UsersManagementServiceBUS {

	@Autowired
	private UsersManagementOrchestrateService usersOrchestrate;

	@Override
	public ResponseWrapper listUserOP(CommonHeader header) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper getUserOP(CommonHeader header, Long iduser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper saveUserOP(CommonHeader header, UserAddRQ rq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper updateUserOP(CommonHeader header, UserUpdateRQ rq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper loginUserOP(CommonHeader header, UserLoginRQ rq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper logoutUserOP(CommonHeader header, UserLogoutRQ rq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper getRolOP(CommonHeader header, Long idrol) {
		return usersOrchestrate.getRolOP(header, idrol);
	}

	@Override
	public ResponseWrapper listRolOP(CommonHeader header) {
		return usersOrchestrate.listRolOP(header);
	}

	@Override
	public ResponseWrapper saveRolOP(CommonHeader header, RolesAddRQ rq) {
		return usersOrchestrate.saveRolOP(header, rq);
	}

	@Override
	public ResponseWrapper updateRolOp(CommonHeader header, RolesUpdateRQ rq) {
		return usersOrchestrate.updateRolOP(header, rq);
	}

}
