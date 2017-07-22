package com.cn.ziqidev;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void testJetty( )
    {
        System.out.println( "Hello World!" );
        Server server = new Server(8088);
        try {

            ContextHandler contextHandler = new ContextHandler("/hello");
            contextHandler.setHandler(new HelloHandler());
            HandlerList handlers = new HandlerList();
            handlers.setHandlers(new Handler[] { contextHandler });
            server.setHandler(handlers);
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end world!");
    }

    public static void main(String[] args) {

    }
}
