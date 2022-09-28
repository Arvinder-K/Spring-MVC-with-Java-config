package lithan.one.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import lithan.one.bean.Customer;
import lithan.one.service.OnService;






@Controller
public class OneControl {
	@Autowired
	private OnService onservice;
	@RequestMapping("/home" )
	public String  home() {
		//List<Customer> listCustomer = customerService.listAll();
		//ModelAndView mav = new ModelAndView("home1");
		//mav.addObject("listCustomer", listCustomer);
		return "index";
	}
	
	@RequestMapping("/about")
	public String  about() {
		//List<Customer> listCustomer = customerService.listAll();
		//ModelAndView mav = new ModelAndView("home1");
		//mav.addObject("listCustomer", listCustomer);
		return "about";
	}
	@RequestMapping("/contact")
	public String  contact(Map<String, Object> model) {
		//List<Customer> listCustomer = customerService.listAll();
		//ModelAndView mav = new ModelAndView("home1");
		//mav.addObject("listCustomer", listCustomer);
		Customer customer = new Customer();
		model.put("customer", customer);
		return "contact";
	}
	@RequestMapping(value = "/cont", method = RequestMethod.POST )
	public String  Postcon(@ModelAttribute("customer") Customer customer) {
		//List<Customer> listCustomer = customerService.listAll();
		//ModelAndView mav = new ModelAndView("home1");
		//mav.addObject("listCustomer", listCustomer);
		System.out.println(customer);
		onservice.save(customer);
		
		return "contact";
	}
}
