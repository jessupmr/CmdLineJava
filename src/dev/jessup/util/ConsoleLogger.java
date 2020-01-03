package dev.jessup.util;

public class ConsoleLogger implements ILogger {

    private String separatorLine;
    private String headerLine;
    private final String INFO = "INFO";
    private final String WARNING = "WARN";
    private final String ERROR = "ERROR";
    private final String logTemplate = "%s | %s";

    @Override
    public void setSeparatorLine(String separatorLine) {
        this.separatorLine = separatorLine;
    }

    @Override
    public void setHeaderLine(String headerLine) {
        this.headerLine = headerLine;
    }

    @Override
    public void separator() {
        writeLine("---");
    }

    @Override
    public void header(String headerText) {
        emptyLine();
        writeLine(headerLine);
        writeLine(headerText);
        writeLine(headerLine);
        emptyLine();
    }

    @Override
    public void emptyLine() {
        writeLine("");
    }

    @Override
    public void emptyLines(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            emptyLine();
        }
    }

    @Override
    public void message(String message) {
        writeLine(message);
    }

    @Override
    public void info(String message) {
        writeLine(String.format(logTemplate, INFO, message));
    }

    @Override
    public void warning(String message) {
        writeLine(String.format(logTemplate, WARNING, message));
    }

    @Override
    public void error(String message) {
        writeLine(String.format(logTemplate, ERROR, message));
    }

    private void writeLine(String message) {
        System.out.println(message);
    }
}
