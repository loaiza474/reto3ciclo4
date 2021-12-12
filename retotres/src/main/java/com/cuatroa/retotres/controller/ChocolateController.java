/**
 * 
 */
package com.cuatroa.retotres.controller;
/**
 * 
 */
import java.util.List;
import java.util.Optional;

import com.cuatroa.retotres.model.Chocolate;
import com.cuatroa.retotres.service.ChocolateService;

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
@RequestMapping("/api/chocolate")
/**
 * 
 */
@CrossOrigin("*")
/**
 * 
 */
public class ChocolateController
{
    /**
     * 
     */
    @Autowired
    /**
     * 
     */
    private ChocolateService accessoryService;
    
    /**
     * 
     * @return
     */
    @GetMapping("/all")
    /**
     * 
     * @return
     */
    public List<Chocolate> getAll() 
    {
        return accessoryService.getAll();
    }
    /**
     * 
     * @param reference
     * @return
     */
    @GetMapping("/{reference}")
    /**
     * 
     * @param reference
     * @return
     */
    public Optional<Chocolate> getClothe(@PathVariable("reference") String reference) 
    {
        return accessoryService.getClothe(reference);
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
    public Chocolate create(@RequestBody Chocolate gadget) 
    {
        return accessoryService.create(gadget);
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
    public Chocolate update(@RequestBody Chocolate gadget) 
    {
        return accessoryService.update(gadget);
    }
    /**
     * 
     * @param reference
     * @return
     */
    @DeleteMapping("/{reference}")
    /**
     * 
     * @param reference
     * @return
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    /**
     * 
     * @param reference
     * @return
     */
    public boolean delete(@PathVariable("reference") String reference) 
    {
        return accessoryService.delete(reference);
    }
    
}