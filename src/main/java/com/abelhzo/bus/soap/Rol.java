package com.abelhzo.bus.soap;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.bus.soap.orchestrate.service.RolesOrchestrateService;
import com.abelhzo.bus.soap.service.RolService;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;

@WebService(serviceName = "RolesServiceBUS", 
			endpointInterface = "com.abelhzo.bus.soap.service.RolService", 
			portName = "RolesServicePortBUS", 
			targetNamespace = "http://abelhzo.bus/roles/")
public class Rol extends SpringBeanAutowiringSupport implements RolService {
	
	@Autowired
	private RolesOrchestrateService rolesOrchestrateService; 

	@Override
	public ResponseWrapper saveRolOP(InCommonHeader header, RolesAddRQ rq) {
		return rolesOrchestrateService.saveRolOP(header, rq);
	}

	@Override
	public ResponseWrapper updateRolOp(InCommonHeader header, RolesUpdateRQ rq) {
		return rolesOrchestrateService.updateRolOP(header, rq);
	}

	@Override
	public ResponseWrapper getRolOP(InCommonHeader header, Long idrol) {
		return rolesOrchestrateService.getRolOP(header, idrol);
	}

	@Override
	public ResponseWrapper listRolOP(InCommonHeader header) {
		return rolesOrchestrateService.listRolOP(header);
	}

}
