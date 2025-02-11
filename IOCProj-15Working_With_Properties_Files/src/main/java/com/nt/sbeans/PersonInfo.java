package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value = {"com/nt/commons/Info.properties", "com/nt/commons/Info1.properties"})
public class PersonInfo {

	// Injecting the values of properties file to spring bean properties
	@Value("${per.id}")
	private Integer pid;

	@Value("${per.name}")
	private String pname;

	@Value("${per.addrs}")
	private String addrs;

	// Injecting direct values to spring bean properties
	@Value("9807654780")
	private Long mobileNo;

	// Injecting the system property values
	@Value("${os.name}")
	private String osName;

	@Value("${os.version}")
	private String os_vr;

	// Injecting the Environment variables values
	@Value("${path}")
	private String path_Data;

	// toString
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", mobileNo=" + mobileNo
				+ ", osName=" + osName + ", os_vr=" + os_vr + ", path_Data=" + path_Data + "]";
	}

}
