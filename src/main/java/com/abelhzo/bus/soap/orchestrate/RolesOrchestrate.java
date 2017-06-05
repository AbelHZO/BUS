package com.abelhzo.bus.soap.orchestrate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abelhzo.bus.soap.gateway.RolesGateway;
import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.bus.soap.orchestrate.service.RolesOrchestrateService;
import com.abelhzo.client.bus.commons.ConfigJAX;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.GetRolSOAP;
import com.abelhzo.client.bus.roles.ListRolSOAP;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;
import com.abelhzo.client.bus.roles.SaveRolSOAP;
import com.abelhzo.client.bus.roles.UpdateRolSOAP;

@Service
public class RolesOrchestrate implements RolesOrchestrateService {
	
	@Autowired
	private RolesGateway rolesGateway;
	
	@Override
	public ResponseWrapper saveRolOP(InCommonHeader header, RolesAddRQ rq) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		SaveRolSOAP saveRolSOAP = new SaveRolSOAP();
		saveRolSOAP.setConfigJAX(configJAX);
		saveRolSOAP.setRolesAddRQ(rq);
		
		ResponseWrapper response = rolesGateway.saveRolOP(saveRolSOAP).getRolRS();
		
		return response;
	}

	@Override
	public ResponseWrapper updateRolOP(InCommonHeader header, RolesUpdateRQ rq) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());
		
		UpdateRolSOAP updateRolSOAP = new UpdateRolSOAP();
		updateRolSOAP.setConfigJAX(configJAX);
		updateRolSOAP.setRolesUpdateRQ(rq);
		
		ResponseWrapper response = rolesGateway.updateRolOP(updateRolSOAP).getRolRS();
		
		return response;
	}

	@Override
	public ResponseWrapper getRolOP(InCommonHeader header, Long idrol) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());

		GetRolSOAP getRolSOAP = new GetRolSOAP();
		getRolSOAP.setConfigJAX(configJAX);
		getRolSOAP.setIdrol(idrol);

		ResponseWrapper response = rolesGateway.getRolOP(getRolSOAP).getRolRS();

		return response;
	}

	@Override
	public ResponseWrapper listRolOP(InCommonHeader header) {
		
		ConfigJAX configJAX = new ConfigJAX();
		configJAX.setIduser(header.getIduser());
		configJAX.setIp(header.getIp());
		configJAX.setLanguage(header.getLanguage());

		ListRolSOAP listRolSoap = new ListRolSOAP();
		listRolSoap.setConfigJAX(configJAX);

		ResponseWrapper response = rolesGateway.listRolOP(listRolSoap).getRolRS();

		return response;
	}
	
}
