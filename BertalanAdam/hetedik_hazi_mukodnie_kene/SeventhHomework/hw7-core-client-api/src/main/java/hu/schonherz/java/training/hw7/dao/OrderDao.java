package hu.schonherz.java.training.hw7.dao;

import java.util.List;

import hu.schonherz.java.training.hw7.dto.Order;

/**
 * DAO interface for Order table.
 * */
public interface OrderDao {

	/**
	 * Inserts an {@link Order} to the Order table.
	 * @param order The object which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addOrder(Order order);

	/**
	 * Inserts a new order to the Order table.
	 * @param user_id The user_id which will be inserted.
	 * @param product_id The product_id which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addOrder(int user_id, int product_id);
	
	/**
	 * Deletes an {@link Order} from the Order table.
	 * @param order The object which will be deleted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteOrder(Order order);
	
	/**
	 * Deletes an order from the Order table.
	 * @param user_id The user_id which will be deleted.
	 * @param product_id The product_id which will be deleted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteOrder(int user_id, int product_id);

	/**
	 * Selects all the orders from the Order table.
	 * @return A {@link List} of {@link Order}s which will contain all the order.
	 */
	List<Order> getAllOrders();
	
	/**
	 * Selects a specific order from the Order table.
	 * @param user_id The user_id which must match with the order's in the Order table.
	 * @param product_id The product_id which must match with the order's in the Order table.
	 * @return The selected {@link Order} object.
	 */
	Order getOrder(int user_id, int product_id);
	
	/**
	 * Selects a specific order from the Order table.
	 * @param order The object which must match with the order in the Order table. 
	 * @return The selected {@link Order} object.
	 */
	Order getOrder(Order order);
}
