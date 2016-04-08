package hu.schonerz.java.training.hw7.service.mapper;

import java.util.ArrayList;
import java.util.List;

import hu.schonerz.java.training.hw7.vo.OrderVo;
import hu.schonherz.java.training.hw7.dto.Order;

// Convert DTO to VO and vice versa.
public class OrderMapper {

	public static OrderVo toVo( Order order ){
		OrderVo ovo = new OrderVo();
		ovo.setUser_id(order.getUser_id());
		ovo.setProduct_id(order.getProduct_id());
		return ovo;
	}
	
	public static List<OrderVo> toVo(List<Order> orders) {
		List<OrderVo> ovos = new ArrayList<>();
		for (Order order : orders) {
			ovos.add( toVo(order) );
		}
		return ovos;
	}
	
	public static Order toDto( OrderVo order ){
		Order o = new Order();
		o.setUser_id(order.getUser_id());
		o.setProduct_id(order.getProduct_id());
		return o;
	}
	
	public static List<Order> toDto(List<OrderVo> ovos) {
		List<Order> orders = new ArrayList<>();
		for (OrderVo ovo : ovos) {
			orders.add(toDto(ovo));
		}
		return orders;
	}
}
