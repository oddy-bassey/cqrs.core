package com.revoltcode.cqrs.core.infrastructure.handler;

import com.revoltcode.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {
    void save(AggregateRoot aggregate);
    T getById(String id);
    void republishEvents();
}
