package pl.tomcki.spring_kurs_1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomcki.spring_kurs_1.service.HelloService;


@RestController
public class HelloController {

				@Autowired
				private HelloService helloService;

//				@Autowired
//				public HelloController(HelloService helloService){
//								this.helloService = helloService;
//				}

				@GetMapping("/")
				public String hello(){
								return helloService.hallo();
				}
}
