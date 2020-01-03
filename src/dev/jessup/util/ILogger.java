package dev.jessup.util;

public interface ILogger {

    void setSeparatorLine(String separatorLine);
    void setHeaderLine(String headerLine);
    void separator();
    void header(String headerText);
    void emptyLine();
    void emptyLines(int numberOfLines);
    void message(String message);
    void info(String message);
    void warning(String message);
    void error(String message);

}
