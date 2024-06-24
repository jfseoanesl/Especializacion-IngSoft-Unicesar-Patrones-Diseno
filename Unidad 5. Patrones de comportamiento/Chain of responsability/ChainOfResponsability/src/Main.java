public class Main {
    public static void main(String[] args) {

        IRequestHandler commanderHandler = new Commander();
        IRequestHandler officerHandler = new Officer();
        IRequestHandler soldierHandler = new Soldier();

        commanderHandler.setNextHandler(officerHandler);
        officerHandler.setNextHandler(soldierHandler);

        Request request = new Request(RequestType.TORTURE_PRISONER, "Tortura prisionero");

        commanderHandler.handleRequest(request);

    }
}