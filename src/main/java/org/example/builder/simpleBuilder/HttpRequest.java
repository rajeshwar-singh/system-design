package org.example.builder.simpleBuilder;

import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final Integer timeout;

    private HttpRequest(Builder httpRequestBuilder) {
        this.url = httpRequestBuilder.url;
        this.method = httpRequestBuilder.method;
        this.headers = httpRequestBuilder.headers == null?Map.of():httpRequestBuilder.headers;
        this.queryParams =httpRequestBuilder.queryParams == null?Map.of():httpRequestBuilder.queryParams;
        this.body = httpRequestBuilder.body == null? "" : httpRequestBuilder.body;
        this.timeout = httpRequestBuilder.timeout;
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
        if (this.timeout != null) {
            System.out.println("timeout: ");
        }
    }


    public static class Builder {
        private String url;
        private String method;
        private Map<String, String> headers;
        private Map<String, String> queryParams;
        private String body;
        private Integer timeout;

        public Builder withUrl(String url)
        {
            this.url = url;
            return this;
        }
        public Builder withMethod(String method)
        {
            this.method = method;
            return this;
        }
        public Builder withHeaders(Map<String, String> headers)
        {
            /*for(Map.Entry<String, String> header: headers.entrySet())
            {
                this.headers.put(header.getKey(),header.getValue());
            }*/
            this.headers = headers==null?Map.of():Map.copyOf(headers);
            return this;
        }
        public Builder withQueryParam(Map<String, String> queryParams)
        {
            /*for(Map.Entry<String, String> queryParam: queryParams.entrySet())
            {
                this.queryParams.put(queryParam.getKey(),queryParam.getValue());
            }*/
            this.queryParams = queryParams == null?Map.of():Map.copyOf(queryParams);
            return this;
        }
        public Builder withBody(String body)
        {
            this.body = body;
            return this;
        }
        public Builder withTimeout(Integer timeout)
        {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build()
        {
            if(url == null || url.isBlank())
            {
                throw new IllegalStateException("Url cannot be null");
            }
            if(method==null || method.isBlank())
            {
                throw new IllegalStateException("Mthed cannot be null");
            }
            if(timeout != null && timeout <= 0) {
                throw new IllegalStateException(
                        "Timeout must be positive");
            }
            return new HttpRequest(this);
        }
    }
}
