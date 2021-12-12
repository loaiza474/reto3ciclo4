/**
 * 
 */
package com.cuatroa.retotres.controller;
/**
 * 
 */
import com.cuatroa.retotres.model.Order;
import com.cuatroa.retotres.service.OrderService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 *  @author DiegoLoaiza 
 *  G18 MINTIC
 * 
 */
@RestController
/**
 * 
 */
@RequestMapping("/api/order")
/**
 * 
 */
@CrossOrigin("*")
/**
 * 
 */
public class OrderController 
{

    @Autowired
    /**
     * 
     */
    private OrderService orderService;
    /**
     * 
     * @return
     */
    @GetMapping("/all")
    /**
     * 
     * @return
     */
    public List<Order> getAll() 
    {
        return orderService.getAll();
    }
    /**
     * 
     * @param id
     * @return
     */
        
    @GetMapping("/{id}")
    /**
     * 
     * @param id
     * @return
     */
    public Optional<Order> getOrder(@PathVariable("id") int id) 
    {
        return orderService.getOrder(id);
    }

    /**
     * 
     * @param gadget
     * @return
     */
    @PostMapping("/new")
    /**
     * 
     * @param gadget
     * @return
     */
    @ResponseStatus(HttpStatus.CREATED)
    /**
     * 
     * @param gadget
     * @return
     */
    public Order create(@RequestBody Order gadget) 
    {
        return orderService.create(gadget);
    }
    /**
     * 
     * @param gadget
     * @return
     */
    @PutMapping("/update")
    /**
     * 
     * @param gadget
     * @return
     */
    @ResponseStatus(HttpStatus.CREATED)
    /**
     * 
     * @param gadget
     * @return
     */
    public Order update(@RequestBody Order gadget) 
    {
        return orderService.update(gadget);
    }
    /**
     * 
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    /**
     * 
     * @param id
     * @return
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    /**
     * 
     * @param id
     * @return
     */
    public boolean delete(@PathVariable("id") int id) 
    {
        return orderService.delete(id);
    }

    /**
     * 
     * @param zona
     * @return
     */
    @GetMapping("/zona/{zona}")
    /**
     * 
     * @param zona
     * @return
     */
    public List<Order> findByZone(@PathVariable("zona") String zona) {
        return orderService.findByZone(zona);
    }

}
