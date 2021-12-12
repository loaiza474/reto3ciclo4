/**
 * 
 */
package com.cuatroa.retotres.repository.crud;
/**
 * 
 */
import com.cuatroa.retotres.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 *  @author DiegoLoaiza 
 *  G18 MINTIC
 * 
 */
public interface ChocolateCrudRepository extends MongoRepository<Chocolate, String> 
{
    
}
