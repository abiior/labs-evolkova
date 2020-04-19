package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Help extends Command {
    private final CommandReciever commandReciever;

    public Help (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.help();
    }

    @Override
    protected void writeInfo() {
        System.out.println("help: вывести справку по доступным командам");
    }
}
