package com.abelhzo.bus.soap.gateway;

import com.abelhzo.client.bus.roles.GetRolSOAP;
import com.abelhzo.client.bus.roles.GetRolSOAPResponse;
import com.abelhzo.client.bus.roles.ListRolSOAP;
import com.abelhzo.client.bus.roles.ListRolSOAPResponse;

public interface RolesGateway {

	public GetRolSOAPResponse getRolOP(GetRolSOAP getRolSoap);

	public ListRolSOAPResponse listRolOP(ListRolSOAP listRolSoap);

}
