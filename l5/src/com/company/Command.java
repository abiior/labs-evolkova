package com.company;

/**
 * Шаблон, по которому описывается команда
 */

public abstract class Command {
    protected abstract void writeInfo();
    protected abstract void execute(String[] args);
}
