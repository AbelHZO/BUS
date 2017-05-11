package com.abelhzo.bus.soap.orchestrate;

import org.springframework.stereotype.Service;

import com.abelhzo.bus.soap.factory.ServicesFactory;
import com.abelhzo.bus.soap.jaxws.CommonHeader;
import com.abelhzo.bus.soap.orchestrate.service.UsersManagementOrchestrateService;
import com.abelhzo.client.bus.commons.ConfigJAX;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesServiceSOAP;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

@Service
public class UsersManagementOrchestrate implements UsersManagementOrchestrateService {

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
		RolesServiceSOAP rolesServiceSOAP = ServicesFactory.getRolesService();
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		ResponseWrapper response = (ResponseWrapper) rolesServiceSOAP.getRolSOAP(configJAX, idrol);
		
		return response;
	}

	@Override
	public ResponseWrapper listRolOP(CommonHeader header) {
		RolesServiceSOAP rolesServiceSOAP = ServicesFactory.getRolesService(); 
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		ResponseWrapper response = (ResponseWrapper) rolesServiceSOAP.listRolSOAP(configJAX);
		
		return response;
	}

	@Override
	public ResponseWrapper saveRolOP(CommonHeader header, RolesAddRQ rq) {
		RolesServiceSOAP rolesServiceSOAP = ServicesFactory.getRolesService(); 
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		ResponseWrapper response = (ResponseWrapper) rolesServiceSOAP.saveRolSOAP(configJAX, rq);
		
		return response;
	}

	@Override
	public ResponseWrapper updateRolOP(CommonHeader header, RolesUpdateRQ rq) {
		RolesServiceSOAP rolesServiceSOAP = ServicesFactory.getRolesService();
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		ResponseWrapper response = (ResponseWrapper) rolesServiceSOAP.updateRolSOAP(configJAX, rq);
		
		return response;
	}

}
