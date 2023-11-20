package factoryRequest;

public class FactoryRequest {

    public static OnlyRequest make (String requestType){
        OnlyRequest request;

        switch (requestType.toLowerCase()){
            case "post":
                request = new ReqPOST();
                break;
            case "update":
                request = new ReqUPDATE();
                break;
            case "delete":
                request= new ReqDELETE();
                break;
            default:
                request= new ReqGET();
                break;
        }
        return request;
    }
}
