package com.abelhzo.bus.soap.jaxws;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.abelhzo.client.bus.commons.Language;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonHeader {

	@XmlElement(required = true)
	private Long iduser;
	@XmlElement(required = true)
	private String ip;
	@XmlElement(required = true)
	private Language language;
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp date;     //<date>2017-05-10 23:44:04</date>
	@XmlElement(required = true)
	private String session;

	public Long getIduser() {
		return iduser;
	}

	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

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
