import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocHandler {
    @Autowired
    private IPrinter printer;

    public void handle(String doc) {
        printer.print(doc);
    }
    @Autowired
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
