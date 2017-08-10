package com.cn.ziqidev;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
        testlinkedList();
    }

    public static void testlinkedList(){
        List<Integer> lists = new LinkedList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        Iterator<Integer> listInter = lists.iterator();
        while(listInter.hasNext()){
            Integer s = listInter.next();
            if(s == 2||s ==3){
                listInter.remove();
            }
        }
        System.out.println(lists.toString());
    }
}
