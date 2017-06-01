package tryout.web.webservice.axis2.helloaxis;

import java.util.Calendar;
import java.util.Date;

public class HelloService {
	public String sayHello(String name){
		return "Hello " + name;
	}
	public String getNow(){
		Calendar cal = Calendar.getInstance();
		//Date date = new Date();
		Date date = cal.getTime();
		String sReturn = new Integer(date.getYear()).toString() + new Integer(date.getMonth()).toString() + new Integer(date.getDay()).toString();
		return sReturn;
	}
}
