package com.abelhzo.bus.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.abelhzo.bus.soap.jaxws.CommonHeader;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolesAddRQ;
import com.abelhzo.client.bus.roles.RolesUpdateRQ;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

@WebService(name = "UsersManagementServiceBUS", targetNamespace = "http://abelhzo.bus/usersmanagement/")
public interface UsersManagementServiceBUS {
	
	/**
	 * Estos son los servicios que interactúan con el endpoint: 
	 * http://dominio:8085/UsersManagementSOAP/UsersServiceSOAP?wsdl
	 * @return
	 */

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "listUserOP")
	public ResponseWrapper listUserOP(
						@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "getUserOP")
	public ResponseWrapper getUserOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "iduser") @XmlElement(required = true) Long iduser);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "saveUserOP")
	public ResponseWrapper saveUserOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "UserAddRQ") @XmlElement(required = true) UserAddRQ rq);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "updateUserOP")
	public ResponseWrapper updateUserOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "UserUpdateRQ") @XmlElement(required = true) UserUpdateRQ rq);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "loginUserOP")
	public ResponseWrapper loginUserOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "UserLoginRQ") @XmlElement(required = true) UserLoginRQ rq);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "logoutUserOP")
	public ResponseWrapper logoutUserOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "UserLogoutRQ") @XmlElement(required = true) UserLogoutRQ rq);
	
	/**
	 * Estos son los servicios que interactúan con el endpoint:
	 * http://dominio:8085/UsersManagementSOAP/RolesServiceSOAP?wsdl
	 * @return
	 */
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "getRolOP")
	public ResponseWrapper getRolOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "idrol") @XmlElement(required = true) Long idrol);
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "listRolOP")
	public ResponseWrapper listRolOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header);
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "saveRolOP")
	public ResponseWrapper saveRolOP(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "RolesAddRQ") @XmlElement(required = true) RolesAddRQ rq);
	
	@WebResult(name = "RolRS")
	@WebMethod(operationName = "updateRolOp")
	public ResponseWrapper updateRolOp(
			@WebParam(name = "CommonHeader") @XmlElement(required = true) CommonHeader header,
			@WebParam(name = "RolesUpdateRQ") @XmlElement(required = true) RolesUpdateRQ rq);

}
