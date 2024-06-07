package com.aj;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Customer {

	private Integer id;
	private String name;
	private String email;
	private Long phno;

}
