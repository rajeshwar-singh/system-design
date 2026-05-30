package org.example.builder.simpleBuilder;

import java.util.Map;

public class HttpRequestBuilder {

    private HttpRequest req;

    //1. create setter method with return type as Builder
    //2. create the build() :: build here act as the terminator

    public HttpRequestBuilder()
    {
        req = new HttpRequest();
    }

    public HttpRequestBuilder withUrl(String url)
    {
        req.url = url;
        return this;
    }

    public HttpRequestBuilder withMethod(String method)
    {
        req.method = method;
        return this;
    }
    public HttpRequestBuilder withHeader(String key, String value)
    {
        req.header.put(key,value);
        return this;
    }
    public HttpRequestBuilder withQueryParam(String key,  String value)
    {
        req.queryParam.put(key,value);
        return this;
    }
    public HttpRequestBuilder withBody(String body)
    {
        req.body = body;
        return this;
    }
    public HttpRequestBuilder withTimeout(int timeout)
    {
        req.timeout = timeout;
        return this;
    }

    public HttpRequest build()
    {
        if(req.url==null || req.url.isEmpty())
        {
            throw new RuntimeException("Url cannot be empty");
        }
        return req;
    }
}
