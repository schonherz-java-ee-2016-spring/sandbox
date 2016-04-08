package hu.schonherz.java.training.hw7.dao;

import java.util.List;

import hu.schonherz.java.training.hw7.dto.Product;

/**
 * DAO interface for Product table.
 * */
public interface ProductDao {

	/**
	 * Inserts a {@link Product} to the Product table.
	 * @param product The {@link Product} object which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addProduct( Product product );

	/**
	 * Inserts a product to the Product table.
	 * @param id The id which will be inserted.
	 * @param name The name which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addProduct( int id, String name );
	
	/**
	 * Inserts a product to the Product table.
	 * The id will be the default in the table.
	 * @param id The id which will be inserted.
	 * @param name The name which will be inserted.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean addProduct( String name );

	/**
	 * Updates an existing {@link Product} in the Product table.
	 * @param product The {@link Product} object which need an update.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean updateProduct( Product product );
	
	/**
	 * Deletes a product from the Product table.
	 * @param name The name which must match with the product's in the table.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteProduct(String name);
	
	/**
	 * Deletes a product from the Product table.
	 * @param id The id which must match with the product's in the table.
	 * @param name The name which must match with the product's in the table.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteProduct( int id, String name );
	
	/**
	 * Deletes a {@link Product} from the Product table.
	 * @param product The {@link Product} object which must match with the product in the table.
	 * @return A boolean indicating the success of the operation.
	 */
	boolean deleteProduct( Product product );
	
	/**
	 * Selects all the products from the Product table.
	 * @return A {@link List} of {@link Product}s which will contain all the product.
	 */
	List<Product> getAllProducts();
	
	/**
	 * Selects a specific product from the Product table.
	 * @param id The id which must match with the product's in the Product table.
	 * @param name The name which must match with the product's in the Product table.
	 * @return The selected {@link Product} object.
	 */
	Product getProduct( int id, String name );
	
	/**
	 * Selects a specific @link Product} from the Product table.
	 * @param product The object which must match with the product in the Product table. 
	 * @return The selected {@link Product} object.
	 */
	Product getProduct( Product product );

}
