package com.cuatroa.retotres.repository;
/**
 * 
 * 
 */
import com.cuatroa.retotres.model.Order;
import com.cuatroa.retotres.repository.crud.OrderCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 *  @author DiegoLoaiza 
 *  G18 MINTIC
 * 
 */
@Repository
public class OrderRepository 
{
    /**
     * 
     */
    @Autowired
    /**
     * 
     */
    private OrderCrudRepository orderCrudRepository;
    /**
     * 
     * @return
     */
    public List<Order> getAll() 
    {
        return (List<Order>) orderCrudRepository.findAll();
    }
    /**
     * 
     * @param id
     * @return
     */
    public Optional<Order> getOrder(int id) 
    {
        return orderCrudRepository.findById(id);
    }
    /**
     * 
     * @param order
     * @return
     */
    public Order create(Order order) 
    {
        return orderCrudRepository.save(order);
    }
    /**
     * 
     * @param order
     */
    public void update(Order order) 
    {
        orderCrudRepository.save(order);
    }
    /**
     * 
     * @param order
     */
    public void delete(Order order) 
    {
        orderCrudRepository.delete(order);
    }
    /**
     * 
     * @return
     */
    public Optional<Order> lastUserId()
    {
        return orderCrudRepository.findTopByOrderByIdDesc();
    }
    /**
     * 
     * @param zona
     * @return
     */
    public List<Order> findByZone(String zona) 
    {
        return orderCrudRepository.findByZone(zona);
    }

}
