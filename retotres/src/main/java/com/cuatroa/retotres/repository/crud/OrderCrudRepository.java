/**
 * 
 */
package com.cuatroa.retotres.repository.crud;
/**
 * 
 */
import com.cuatroa.retotres.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 *  @author DiegoLoaiza
 *  G18 MINTIC
 * 
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> 
{
    /**
     * 
     * @param country
     * @return
     */
    @Query("{'salesMan.zone': ?0}")
    /**
     * 
     * @param country
     * @return
     */
    List<Order> findByZone(final String country); 
    /**
     * 
     * @param status
     * @return
     */
    @Query("{status: ?0}")
    /**
     * 
     * @param status
     * @return
     */
    List<Order> findByStatus(final String status);
    /**
     * 
     * @return
     */
    Optional<Order> findTopByOrderByIdDesc();
    /**
     * 
     * @param zone
     * @return
     */
    List<Order> findBySalesManZone(String zone);
    
}

