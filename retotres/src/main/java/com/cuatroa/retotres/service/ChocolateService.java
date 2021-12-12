/**
 * 
 */
package com.cuatroa.retotres.service;
/**
 * 
 */
import java.util.List;
import java.util.Optional;

import com.cuatroa.retotres.model.Chocolate;
import com.cuatroa.retotres.repository.ChocolateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 *  @author DiegoLoaiza 
 *  G18 MINTIC
 * 
 */
@Service
/**
 * 
 */
public class ChocolateService 
{
    /**
     * 
     */
    @Autowired
    /**
     * 
     */
    private ChocolateRepository clotheRepository;
    /**
     * 
     * @return
     */
    public List<Chocolate> getAll() 
    {
        return clotheRepository.getAll();
    }
    /**
     * 
     * @param reference
     * @return
     */
    public Optional<Chocolate> getClothe(String reference) 
    {
        return clotheRepository.getClothe(reference);
    }
    /**
     * 
     * @param accesory
     * @return
     */
    public Chocolate create(Chocolate accesory) 
    {
        if (accesory.getReference() == null) 
        {
            return accesory;
        } 
        else 
        {
            return clotheRepository.create(accesory);
        }
    }
    /**
     * 
     * @param accesory
     * @return
     */
    public Chocolate update(Chocolate accesory) 
    {
        /**
         * 
         */
        if (accesory.getReference() != null) 
        {
            Optional<Chocolate> accesoryDb = clotheRepository.getClothe(accesory.getReference());
            if (!accesoryDb.isEmpty()) 
            {   
                /**
                 * 
                 */
                if (accesory.getCategory()!= null) 
                {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }
                /**
                 * 
                 */
                if (accesory.getDescription() != null) 
                {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                /**
                 * 
                 */
                if (accesory.getPrice() != 0.0) 
                {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                /**
                 * 
                 */
                if (accesory.getQuantity() != 0) 
                {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                /**
                 * 
                 */
                if (accesory.getPhotography() != null) 
                {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                /**
                 * 
                 */
                accesoryDb.get().setAvailability(accesory.isAvailability());
                clotheRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } 
            else 
            {
                return accesory;
            }
        } 
        else 
        {
            return accesory;
        }
    }
    /**
     * 
     * @param reference
     * @return
     */
    public boolean delete(String reference) 
    {
        Boolean aBoolean = getClothe(reference).map(accesory -> 
        {
            clotheRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
