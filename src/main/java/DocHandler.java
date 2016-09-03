public class DocHandler {

    private IPrinter printer;

    public void handle(String doc) {
        printer.print(doc);
    }

    public DocHandler(IPrinter printer) {
        this.printer = printer;
    }

    public DocHandler() {
    }

    public IPrinter getPrinter() {
        return printer;
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }
}
