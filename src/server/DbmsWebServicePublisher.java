/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.xml.ws.Endpoint;

/**
 *
 * @author pc
 */
public class DbmsWebServicePublisher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endpoint.publish("http://localhost:1986/wss/hello", new DbmsWebServiceImpl());
        System.out.println("WebServer started...");
        //http://localhost:1986/wss/hello?wsdl
    }
    
}
