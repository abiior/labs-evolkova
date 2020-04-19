package com.company;

public class DescengingHeight extends Command {
    private final CommandReciever commandReciever;

    public DescengingHeight (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void writeInfo() {

        System.out.println("print_field_descending_field: вывести значения height в порядке убывания");
    }

    @Override
    protected void execute(String[] args) {

        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.descendingHeight();

    }
}

