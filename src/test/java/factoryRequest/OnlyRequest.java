package factoryRequest;

import org.omg.PortableInterceptor.RequestInfo;

import io.restassured.response.Response;

public interface OnlyRequest {

    Response send(RequestInfo info);

}
