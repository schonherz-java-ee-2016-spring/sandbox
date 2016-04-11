package hu.schonerz.java.training.hw7.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import hu.schonerz.java.training.hw7.service.OrderService;
import hu.schonerz.java.training.hw7.vo.ProductVo;
import hu.schonerz.java.training.hw7.vo.UserVo;
import hu.schonherz.java.training.hw7.dao.OrderDao;
import hu.schonherz.java.training.hw7.dto.Order;

// Tells spring that this class is a service class.
@Service("orderService")
@Lazy(true)
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void addOrder(UserVo user, ProductVo product) {
		Order order = new Order();
		order.setUser_id(user.getId());
		order.setProduct_id(product.getId());
		
		orderDao.addOrder(order);
	}

	@Override
	public void addOrder(int user_id, int product_id) {
		orderDao.addOrder(user_id, product_id);
	}

}
