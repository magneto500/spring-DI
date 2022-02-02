package pl.tomcki.spring_kurs_1.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloService {

				@GetMapping("/")
				public String hallo (){
								return "hello world";
				}

}
