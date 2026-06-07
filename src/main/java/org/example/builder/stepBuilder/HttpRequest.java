package org.example.builder.stepBuilder;

import org.example.builder.stepBuilder.stepInterface.BodyStep;
import org.example.builder.stepBuilder.stepInterface.MethodStep;
import org.example.builder.stepBuilder.stepInterface.OptionalStep;
import org.example.builder.stepBuilder.stepInterface.UrlStep;

import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String method;
    private final String body;
    private final Map<String, String> headers;
    private final Integer timeout;

    private HttpRequest(StepBuilder builder)
    {
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body == null ? "" : builder.body;
        this.headers = builder.headers == null
                ? Map.of()
                : Map.copyOf(builder.headers);
        this.timeout = builder.timeout;
    }

    public static UrlStep builder()
    {
        return new StepBuilder();
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

        if (!this.body.isEmpty()) {
            System.out.println("body: " + this.body);
        }
        if (timeout != null) {
            System.out.println("timeout: " + timeout);
        }

    }


    public static class StepBuilder implements UrlStep, MethodStep, BodyStep, OptionalStep {
        private String url;
        private String method;
        private String body;
        private Map<String, String> headers;
        private Integer timeout;

        @Override
        public OptionalStep withBody(String body) {
            this.body = body;
            return this;
        }

        @Override
        public BodyStep withMethod(String method) {
            this.method = method;
            return this;
        }

        @Override
        public OptionalStep withHeaders(Map<String, String> headers) {
            this.headers = headers == null
                    ? Map.of()
                    : Map.copyOf(headers);
            return this;
        }

        @Override
        public OptionalStep withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        @Override
        public HttpRequest build() {
            if(url==null || url.isBlank())
            {
                throw new IllegalStateException("Url cannot be empty");
            }
            if(method==null || method.isBlank())
            {
                throw new IllegalStateException("method cannot be null");
            }
            if(body == null || body.isBlank())
            {
                throw new IllegalStateException("body cannot be null");
            }
            return new HttpRequest(this);
        }

        @Override
        public MethodStep withUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
