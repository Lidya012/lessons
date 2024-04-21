package com.lidiya.project.lesson21.taskhome;

import java.util.function.Predicate;

@FunctionalInterface
public interface TaskPredicate
        extends Predicate<Task> {
}