package com.beatricefarias.chainofresponsibility;

public enum LogType {
    INFO(0),
    DEBUG(1),
    ERROR(2);

    private Integer logType;

    LogType(Integer logType) {
        this.logType = logType;
    }

    public Integer getLogType() {
        return logType;
    }
}
