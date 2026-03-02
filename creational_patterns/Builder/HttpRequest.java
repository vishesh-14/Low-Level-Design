package creational_patterns.Builder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    // Required Fields
    private final String url;

    // Optional
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    public HttpRequest(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.headers = Collections.unmodifiableMap(new HashMap<>(builder.headers));
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;

    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public String getBody() {
        return body;
    }

    public int getTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public static class Builder {
        private final String url;

        // Optional
        private  String method;
        private  Map<String, String> headers = new HashMap<>();
        private  Map<String, String> queryParams = new HashMap<>();
        private  String body;
        private  int timeout = 3000;

        public Builder(String url) {
            // required fields need to be send in the parameter
            this.url = url;
        }

        public Builder addMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder addHeaders(String key,String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder addQueryParams(String key,String value) {
            this.queryParams.put(key,value);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }
        public HttpRequest build(){
            return new HttpRequest(this);
        }

    }
}