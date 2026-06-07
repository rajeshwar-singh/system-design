package org.example.builder.stepBuilder.stepInterface;


import org.example.builder.stepBuilder.HttpRequest;

import java.util.Map;

public interface OptionalStep {
    OptionalStep withHeaders(Map<String, String> headers);
    OptionalStep withTimeout(Integer timeout);
    HttpRequest build();
}
