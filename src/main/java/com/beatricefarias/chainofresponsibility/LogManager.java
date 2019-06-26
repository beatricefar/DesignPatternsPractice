package com.beatricefarias.chainofresponsibility;

public class LogManager {

    private LoggerChainElement elementInfo = new LoggerChainElement(
            LogType.INFO.getLogType(),
            "This is info log"
    );

    private LoggerChainElement elementDebug = new LoggerChainElement(
            LogType.DEBUG.getLogType(),
            "This is debug log"
    );

    private LoggerChainElement elementError = new LoggerChainElement(
            LogType.ERROR.getLogType(),
            "This is error log"
    );

    private LoggerChainElement getLoggers() {
        elementInfo.setNext(elementDebug);
        elementDebug.setNext(elementError);
        return elementInfo;
    }

    public void logChain(int request) {
        getLoggers().onRequest(request);
    }

}
