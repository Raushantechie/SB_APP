package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestContriller {

	@GetMapping("/enjoy")
	public String getMsg() {
		System.out.println(" firing get method from restcontroller");
		return " User name is Raushan";
	}

	@GetMapping("/more")
	public String getRedirectedMethod() {
		System.out.println(" getRedirectedMethod :");
		return "get msg Rediredted to >>> getRedirectedMethod";
	}
}
