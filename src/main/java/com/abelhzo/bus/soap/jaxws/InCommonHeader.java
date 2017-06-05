package com.abelhzo.bus.soap.jaxws;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.abelhzo.client.bus.commons.ConfigJAX;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class InCommonHeader extends ConfigJAX {

	@XmlElement(required = true)
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp date;     //<date>2017-05-10 23:44:04</date>
	@XmlElement(required = true)
	private String session;

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

}
