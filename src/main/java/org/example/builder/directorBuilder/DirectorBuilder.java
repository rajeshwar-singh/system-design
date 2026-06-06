package org.example.builder.directorBuilder;

public class DirectorBuilder {


    public HttpRequest getRequestBuilder(String url)
    {
        return HttpRequest.builder()
                .withUrl(url==null?null:url)
                .withMethod("GET")
                .build();
    }

    public HttpRequest postRequestWithBodyBuilder(String url, String body)
    {
        return HttpRequest.builder()
                .withUrl(url==null?null:url)
                .withMethod("POST")
                .withBody(body)
                .build();
    }
}
