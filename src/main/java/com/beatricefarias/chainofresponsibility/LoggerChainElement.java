package com.beatricefarias.chainofresponsibility;

public class LoggerChainElement extends BaseElement<Integer> {

    private Integer request;
    private String loggerMessage;

    public LoggerChainElement(
            Integer request,
            String loggerMessage
    ) {
        this.request = request;
        this.loggerMessage = loggerMessage;
    }

    @Override
    protected void manage(Integer request) {
        System.out.println(loggerMessage);
    }

    @Override
    protected boolean canManage(Integer request) {
        return this.request.equals(request);
    }

}
