package com.abelhzo.bus.soap.gateway;

import com.abelhzo.client.bus.roles.GetRolSOAP;
import com.abelhzo.client.bus.roles.GetRolSOAPResponse;
import com.abelhzo.client.bus.roles.ListRolSOAP;
import com.abelhzo.client.bus.roles.ListRolSOAPResponse;
import com.abelhzo.client.bus.roles.SaveRolSOAP;
import com.abelhzo.client.bus.roles.SaveRolSOAPResponse;
import com.abelhzo.client.bus.roles.UpdateRolSOAP;
import com.abelhzo.client.bus.roles.UpdateRolSOAPResponse;

public interface RolesGateway {
	
	public SaveRolSOAPResponse saveRolOP(SaveRolSOAP saveRolSOAP);
	
	public UpdateRolSOAPResponse updateRolOP(UpdateRolSOAP updateRolSOAP);

	public GetRolSOAPResponse getRolOP(GetRolSOAP getRolSoap);

	public ListRolSOAPResponse listRolOP(ListRolSOAP listRolSoap);

}
