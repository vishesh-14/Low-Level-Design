package creational_patterns.Builder;

public class HttpRequesExample {
    public static void main(String[] args) {

        HttpRequest request1 = new HttpRequest.Builder("https://api.example.com/data")
                .addMethod("GET")
                .addHeaders("Accept", "application/json")
                .addQueryParams("type", "user")
                .addQueryParams("active", "true")
                .build();

        HttpRequest request2 =    new HttpRequest.Builder("https://api.example.com/data")
                .addMethod("POST")
                .addHeaders("Content-Type", "application/json")
                .addQueryParams("type", "user")
                .addQueryParams("active", "true")
                .body("{\"name\":\"John Doe\",\"email\":\")}")
                .build();


        System.out.println(request1);
        System.out.println(request2);
    }
}
