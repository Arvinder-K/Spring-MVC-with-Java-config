package lithan.one.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lithan.one.bean.Customer;
import lithan.one.dao.OneRepository;

@Service
@Transactional
public class OnService {
	@Autowired
	 OneRepository repo;
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	
}
