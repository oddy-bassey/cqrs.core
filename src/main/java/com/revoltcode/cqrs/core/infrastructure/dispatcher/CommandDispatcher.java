package com.revoltcode.cqrs.core.infrastructure.dispatcher;

import com.revoltcode.cqrs.core.command.BaseCommand;
import com.revoltcode.cqrs.core.command.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
