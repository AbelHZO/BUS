package com.abelhzo.bus.soap.transformer;

import javax.xml.bind.JAXBElement;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.abelhzo.client.bus.roles.GetRolSOAPResponse;
import com.abelhzo.client.bus.roles.ListRolSOAPResponse;
import com.abelhzo.client.bus.roles.SaveRolSOAPResponse;
import com.abelhzo.client.bus.roles.UpdateRolSOAPResponse;

@Component("rolesTransformer")
public class RolesTransformer {
	
	@Transformer
	public SaveRolSOAPResponse responseSaveRol(JAXBElement<SaveRolSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public UpdateRolSOAPResponse responseUpdateRol(JAXBElement<UpdateRolSOAPResponse> jaxb) {
		return jaxb.getValue();
	}

	@Transformer
	public ListRolSOAPResponse responseListRol(JAXBElement<ListRolSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
	@Transformer
	public GetRolSOAPResponse responseGetRol(JAXBElement<GetRolSOAPResponse> jaxb) {
		return jaxb.getValue();
	}
	
}
