package factoryRequest;

import Utilitarios.GetProperties;
import org.omg.PortableInterceptor.RequestInfo;

import javax.xml.ws.Response;

public class ReqDELETE implements OnlyRequest {

    public Response send(RequestInfo info) {
        Response response =given()
                .filter(new AllureRestAssured())
                .auth()
                .preemptive()
                .basic(GetProperties.getInstance().getUsuario(),
                        GetProperties.getInstance().getContrasena())
                .log().all()
                .when()
                .delete(info.getUrl());
        response.then().log().all();
        return response;
    }
}
