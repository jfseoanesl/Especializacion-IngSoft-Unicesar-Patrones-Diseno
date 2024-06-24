public class Soldier implements IRequestHandler {

    private IRequestHandler requestHandler;


    @Override
    public void setNextHandler(IRequestHandler nextHandler) {
        this.requestHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.COLLECT_TAX)) {
            System.out.println("Soldado cobrando impuestos");
        } else if (requestHandler != null) {
            System.out.println("Delegando orden a otro subdito");
            requestHandler.handleRequest(request);
        } else {
            System.out.println("Orden imposible de acatar");
        }
    }
}
