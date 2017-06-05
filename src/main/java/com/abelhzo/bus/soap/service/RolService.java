package com.abelhzo.bus.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;

@WebService(name = "RolesServiceBUS", 
			targetNamespace = "http://abelhzo.bus/roles/")
public interface RolService {
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "saveRolOP")
	public ResponseWrapper saveRolOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "RolesAddRQ") @XmlElement(required = true) RolesAddRQ rq);
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "updateRolOp")
	public ResponseWrapper updateRolOp(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "RolesUpdateRQ") @XmlElement(required = true) RolesUpdateRQ rq);	
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "getRolOP")
	public ResponseWrapper getRolOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "idrol") @XmlElement(required = true) Long idrol);
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "listRolOP")
	public ResponseWrapper listRolOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header);

}
