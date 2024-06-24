public class Request {
    private RequestType requestType;
    private String requestDescription;

    public Request(RequestType requestType, String requestDescription) {
        this.requestDescription = requestDescription;
        this.requestType = requestType;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestDescription='" + requestDescription + '\'' +
                '}';
    }
}
