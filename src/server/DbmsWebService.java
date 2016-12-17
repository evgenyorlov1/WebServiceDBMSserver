/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author pc
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface DbmsWebService {
    @WebMethod(operationName = "getHelloString")
    public String getHelloString();
    
    @WebMethod(operationName = "show_dbs")
    public String show_dbs ();
    
    @WebMethod(operationName = "show_tables")
    public String show_tables (@WebParam(name="DBname") String DBname);
    
    @WebMethod(operationName = "drop_database")
    public void drop_database (@WebParam(name="DBname") String DBname);
    
    @WebMethod(operationName = "drop_table")
    public void drop_table (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname);
    
    @WebMethod(operationName = "create_database")
    public void create_database (@WebParam(name="DBname") String DBname);
    
    @WebMethod(operationName = "create_table")
    public void create_table (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname, @WebParam(name="keyType") String keyType);
    
    @WebMethod(operationName = "register")
    public boolean register (@WebParam(name="user") String user, @WebParam(name="password") String password);
    
    @WebMethod(operationName = "login")
    public boolean login (@WebParam(name="user") String user, @WebParam(name="password") String password);
    
    @WebMethod(operationName = "find")
    public String find (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname);
    
    @WebMethod(operationName = "is_unique_name")
    public boolean is_unique_name (@WebParam(name="DBname") String DBname);
    
    @WebMethod(operationName = "get_metadata")
    public String get_metadata (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname);
    
    @WebMethod(operationName = "limit")
    public String limit (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname, @WebParam(name="num") int num);
    
    @WebMethod(operationName = "skip")
    public String skip (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname, @WebParam(name="num") int num);
    
    @WebMethod(operationName = "sort")
    public String sort (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname, @WebParam(name="key") String key, @WebParam(name="num") int num);
    
    @WebMethod(operationName = "count")
    public int count (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname);
    
    @WebMethod(operationName = "insert")
    public void insert (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname, @WebParam(name="keyValue") String keyValue);
    
    @WebMethod(operationName = "update")
    public void update (@WebParam(name="id") String id, @WebParam(name="keyVal") String keyVal, @WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname);
    
    @WebMethod(operationName = "remove")
    public void remove (@WebParam(name="DBname") String DBname, @WebParam(name="Tname") String Tname, @WebParam(name="id") String id);
}
