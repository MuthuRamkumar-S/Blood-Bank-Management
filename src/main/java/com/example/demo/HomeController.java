package com.example.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	
	@Autowired
	donarRepo repo;
	private Emailsender senderService;
//	private mailie sender;
	@RequestMapping("/index")
	public String home()
	{
		System.out.println("hello this is ram");
		return "index.html";
	}

	@RequestMapping("/donar1")
	public String donar1()
	{
		System.out.println("this is donar");
		return "donar.html";
	}
	
	@GetMapping("/addDonar")
	public String addDonar(@RequestParam("name") String name,
							@RequestParam("gender") String gender,
							@RequestParam("age") String age,
							@RequestParam("bgp") String bgp,
							@RequestParam("city") String city,
							@RequestParam("district") String district,
							@RequestParam("state") String state,
							@RequestParam("phn") String phn,
							@RequestParam("email") String email,
							@RequestParam("exp") String exp,
							@RequestParam("hexp") String hexp)
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(bgp);
		System.out.println(city);
		System.out.println(district);
		System.out.println(state);
		System.out.println(phn);
		System.out.println(email);
		System.out.println(exp);
		System.out.println(hexp);
		try
		{
//			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
			System.out.println("Connected");
			Statement st = con.createStatement();
			st.executeUpdate("insert into donar values('"+name+"','"+gender+"','"+age+"','"+bgp+"','"+city+"','"+district+"','"+state+"','"+phn+"','"+email+"','"+exp+"','"+hexp+"')");
			System.out.println("Added");
		}
		catch(Exception e)
		{
			System.out.println("not connected");
		}
		return "index.html";
	}
	
	@RequestMapping("/donar")
//	@ResponseBody
	public String donar(Model m)
	{
//		ModelAndView mv = new ModelAndView("donardetail.jsp");
//		Iterable<com.example.demo.donar> d = repo.findAll();
//		return d;
//		return repo.findAll().toString();
		m.addAttribute("result",repo.findAll());
		return "donardetail.jsp";
//		return "needer.html";
	}
	
		@RequestMapping("/mailie")
//		@EventListener(ApplicationReadyEvent.class)
		public void sendMail() {
			senderService.sendEmail("muthuramlap262003@gmail.com",
					"This is subject",
					"This is body");
	}
	
}
