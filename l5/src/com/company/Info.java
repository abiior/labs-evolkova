package com.company;

public class Info extends Command {
    private final CommandReciever commandReciever;

    public Info (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Что-то пошло не так");
        }
        commandReciever.info();
    }

    @Override
    protected void writeInfo() {
        System.out.println("info: вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
    }
}
