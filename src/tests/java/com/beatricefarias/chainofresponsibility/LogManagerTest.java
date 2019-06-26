package com.beatricefarias.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class LogManagerTest {

    @Mock
    private LoggerChainElement elementInfo = new LoggerChainElement(
            LogType.INFO.getLogType(),
            "This is info log"
    );
    @Mock
    LoggerChainElement elementDebug = new LoggerChainElement(
            LogType.DEBUG.getLogType(),
            "This is debug log"
    );
    @Mock
    LoggerChainElement elementError = new LoggerChainElement(
            LogType.ERROR.getLogType(),
            "This is error log"
    );

    @InjectMocks
    private LogManager logManager = new LogManager();

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void valid_logInfo() {
        // Assemble

        // Act
        logManager.logChain(LogType.INFO.getLogType());

        // Assert
        verify(elementInfo).onRequest(LogType.INFO.getLogType());
    }

    @Test
    void valid_logDebug() {
        // Assemble

        // Act
        logManager.logChain(LogType.DEBUG.getLogType());

        // Assert
        verify(elementInfo).onRequest(LogType.DEBUG.getLogType());
    }

    @Test
    void valid_logError() {
        // Assemble

        // Act
        logManager.logChain(LogType.ERROR.getLogType());

        // Assert
        verify(elementInfo).onRequest(LogType.ERROR.getLogType());
    }

}