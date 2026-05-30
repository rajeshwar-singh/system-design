package org.example.builder.simpleBuilder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    String url;
    String method;
    Map<String, String> header;
    Map<String, String> queryParam;
    String body;
    int timeout;

    HttpRequest(){
        header = new HashMap<>();
        queryParam = new HashMap<>();
        body = "";
    }

    //create a execute method
    public void execute()
    {
        System.out.println("Executing " + method + " request to "+ url);
        if(!url.isEmpty())
        {
            System.out.println("url: " + url);
        }
        if(!method.isEmpty())
        {
            System.out.println("method: "+method);
        }
        if(!header.isEmpty())
        {
            System.out.println("header: ");
            for(Map.Entry<String, String> mp : header.entrySet())
            {
                System.out.println(" "+mp.getKey()+" : " + mp.getValue());
            }
        }
        if(!queryParam.isEmpty())
        {
            System.out.println("query-param: ");
            for(Map.Entry<String, String> mp : queryParam.entrySet())
            {
                System.out.println(" " + mp.getKey() + " : "+mp.getValue());
            }
        }
        if(!body.isEmpty())
        {
            System.out.println("body : " + body);
        }
        System.out.println("Timeout: " + timeout + " seconds");
        System.out.println("Request executed successfully!");
    }
}
