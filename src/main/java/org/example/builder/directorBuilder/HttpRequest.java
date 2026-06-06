package org.example.builder.directorBuilder;

import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;

    private HttpRequest(Builder builder)
    {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers == null?Map.of():builder.headers;
        this.queryParams = builder.queryParam == null? Map.of():builder.queryParam;
        this.body = builder.body == null? "": builder.body;

    }

    public static Builder builder()
    {
        return new Builder();
    }

    public void execute() {
        if (!this.url.isEmpty()) {
            System.out.println("url: " + this.url);
        }
        if (!this.method.isEmpty()) {
            System.out.println("method: " + this.method);
        }
        if (!this.headers.isEmpty()) {
            System.out.println("header: ");
            for (Map.Entry<String, String> header : headers.entrySet()) {
                System.out.println(header.getKey() + " : " + header.getValue());
            }
        }
        if (!this.queryParams.isEmpty()) {
            System.out.println("queryParam: ");
            for (Map.Entry<String, String> param : queryParams.entrySet()) {
                System.out.println(param.getKey() + " : " + param.getValue());
            }
        }
        if (!this.body.isEmpty()) {
            System.out.println("body: " + this.body);
        }

    }

    public static class Builder {
        private String url;
        private String method;
        private Map<String, String> headers;
        private Map<String, String> queryParam;
        private String body;


        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }
        public Builder withMethod(String method)
        {
            this.method = method;
            return this;
        }
        public Builder withHeaders(Map<String,String> headers)
        {
            this.headers = headers == null? Map.of():Map.copyOf(headers);
            return this;
        }
        public Builder withQueryParam(Map<String, String> queryParam)
        {
            this.queryParam = queryParam==null? Map.of():Map.copyOf(queryParam);
            return this;
        }
        public Builder withBody(String body) {
            this.body = body;
            return this;
        }
        public HttpRequest build()
        {
            if(url == null || url.isBlank())
            {
                throw new IllegalStateException("Url cannot be empty");
            }
            if(method == null || method.isBlank())
            {
                throw new IllegalStateException("Method cannot be empty");
            }
            return new HttpRequest(this);
        }
    }
}
