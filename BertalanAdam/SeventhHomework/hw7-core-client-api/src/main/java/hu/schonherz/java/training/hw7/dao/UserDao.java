package hu.schonherz.java.training.hw7.dao;

import java.util.List;

import hu.schonherz.java.training.hw7.dto.Product;
import hu.schonherz.java.training.hw7.dto.User;

/**
 * DAO interface for User table.
 */
public interface UserDao {

	/**
	 * Inserts an {@link User} to the User table.
	 * @param user the {@link User} object which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addUser( User user );
	
	/**
	 * Inserts an user to the User table.
	 * @param id The id which will be inserted.
	 * @param name The name which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addUser( String name );
	
	/**
	 * Deletes an {@link User} from the User table.
	 * @param user The {@link User} object which must match with the user in the table.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteUser( User user );
	
	/**
	 * Deletes an user from the User table.
	 * @param name The name which must match with the user's in the table.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteUser(String name);
	
	/**
	 * Selects all the users from the User table.
	 * @return A {@link List} of {@link User}s which will contain all the user.
	 */
	List<User> getAllUsers();
	
	/**
	 * Selects a specific {@link User} from the User table.
	 * @param user The object which must match with the user in the User table. 
	 * @return The selected {@link User} object.
	 */
	User getUser( User user );
	
	/**
	 * Selects a specific user from the User table.
	 * @param id The id which must match with the user's in the table.
	 * @param name The name which must match with the user's in the table.
	 * @return The selected {@link User} object.
	 */
	User getUser( String name, String password );
	
	/**
	 * Selects all the products that a specific {@link User} ordered.
	 * @param user The {@link User} whom ordered products are needed.
	 * @return A {@link List} of {@link Product}s containing all the products the user ordered.
	 */
	List<Product> getOrdersOfUser(User user);
	
	/**
	 * Selects all the products that a specific user ordered.
	 * @param id The id which must match with the user's in the table.
	 * @param name The name which must match with the user's in the table.
	 * @return A {@link List} of {@link Product}s containing all the products the user ordered.
	 */
	List<Product> getOrdersOfUser(String name);
}
