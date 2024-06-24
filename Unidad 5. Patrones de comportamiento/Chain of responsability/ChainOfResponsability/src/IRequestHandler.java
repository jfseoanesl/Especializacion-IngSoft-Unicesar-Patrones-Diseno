public interface IRequestHandler {
    void setNextHandler(IRequestHandler nextHandler);
    void handleRequest(Request request);
}
