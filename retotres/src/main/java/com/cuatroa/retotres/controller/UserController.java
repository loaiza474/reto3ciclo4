/**
 * 
 */
package com.cuatroa.retotres.controller;
/**
 * 
 * 
 */
import com.cuatroa.retotres.model.User;
import com.cuatroa.retotres.service.UserService;
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
@RequestMapping("/api/user")
/**
 * 
 */
@CrossOrigin("*")
/**
 * 
 */
public class UserController 
{
    /**
     * 
     */
    @Autowired
    /**
     * 
     */
    private UserService userService;
    /**
     * 
     * @return
     */
    @GetMapping("/all")
    /**
     * 
     * @return
     */
    public List<User> getAll() 
    {
        return userService.getAll();
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
    public Optional <User> getUser(@PathVariable("id") int id) 
    {
        return userService.getUser(id);
    }
    /**
     * 
     * @param user
     * @return
     */
    @PostMapping("/new")
    /**
     * 
     * @param user
     * @return
     */
    @ResponseStatus(HttpStatus.CREATED)
    /**
     * 
     * @param user
     * @return
     */
    public User create(@RequestBody User user)
    {
        return userService.create(user);
    }
    /**
     * 
     * @param user
     * @return
     */
    @PutMapping("/update")
    /**
     * 
     * @param user
     * @return
     */
    @ResponseStatus(HttpStatus.CREATED)
    /**
     * 
     * @param user
     * @return
     */
    public User update(@RequestBody User user) 
    {
        return userService.update(user);
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
        return userService.delete(id);
    }
    /**
     * 
     * @param email
     * @param password
     * @return
     */
    @GetMapping("/{email}/{password}")
    /**
     * 
     * @param email
     * @param password
     * @return
     */
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) 
    {
        return userService.authenticateUser(email, password);
    }
    /**
     * 
     * @param email
     * @return
     */
    @GetMapping("/emailexist/{email}")
    /**
     * 
     * @param email
     * @return
     */
    public boolean emailExists(@PathVariable("email") String email) 
    {
        return userService.emailExists(email);
    }
    
}
