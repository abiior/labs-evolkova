package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Clear extends Command {
    private final CommandReciever commandReciever;

    public Clear (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.clear();
    }

    @Override
    protected void writeInfo() {
        System.out.println("clear: очистить коллекцию");
    }
}
