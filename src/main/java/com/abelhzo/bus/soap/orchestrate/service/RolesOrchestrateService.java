package com.abelhzo.bus.soap.orchestrate.service;

import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;

public interface RolesOrchestrateService {
	
	public ResponseWrapper saveRolOP(InCommonHeader header, RolesAddRQ rq);
	
	public ResponseWrapper updateRolOP(InCommonHeader header, RolesUpdateRQ rq);
	
	public ResponseWrapper getRolOP(InCommonHeader header, Long idrol);
	
	public ResponseWrapper listRolOP(InCommonHeader header);

}
