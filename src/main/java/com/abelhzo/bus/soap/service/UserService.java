package com.abelhzo.bus.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.abelhzo.bus.soap.jaxws.InCommonHeader;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.users.UserAddRQ;
import com.abelhzo.client.bus.users.UserLoginRQ;
import com.abelhzo.client.bus.users.UserLogoutRQ;
import com.abelhzo.client.bus.users.UserUpdateRQ;

@WebService(name = "UsersServiceBUS", 
			targetNamespace = "http://abelhzo.bus/users/")
public interface UserService {
	
	@WebResult(name = "UserRS")
	@WebMethod(operationName = "saveUserOP")
	public ResponseWrapper saveUserOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "UserAddRQ") @XmlElement(required = true) UserAddRQ rq);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "updateUserOP")
	public ResponseWrapper updateUserOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "UserUpdateRQ") @XmlElement(required = true) UserUpdateRQ rq);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "listUserOP")
	public ResponseWrapper listUserOP(
						@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "getUserOP")
	public ResponseWrapper getUserOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "iduser") @XmlElement(required = true) Long iduser);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "loginUserOP")
	public ResponseWrapper loginUserOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "UserLoginRQ") @XmlElement(required = true) UserLoginRQ rq);

	@WebResult(name = "UserRS")
	@WebMethod(operationName = "logoutUserOP")
	public ResponseWrapper logoutUserOP(
			@WebParam(name = "InCommonHeader") @XmlElement(required = true) InCommonHeader header,
			@WebParam(name = "UserLogoutRQ") @XmlElement(required = true) UserLogoutRQ rq);

}
