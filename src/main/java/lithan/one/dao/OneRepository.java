package lithan.one.dao;




import org.springframework.data.repository.CrudRepository;


import lithan.one.bean.Customer;


public interface OneRepository extends CrudRepository<Customer, Long>{
	//@Query(value = "SELECT c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%'"
	//		+ " OR c.email LIKE '%' || :keyword || '%'"
	//		+ " OR c.address LIKE '%' || :keyword || '%'")
	//public List<Customer> search(@Param("keyword") String keyword);
}
