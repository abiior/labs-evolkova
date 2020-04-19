package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Update extends Command {
    private final CommandReciever commandReciever;

    public Update (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.update();
    }

    @Override
    protected void writeInfo() {
        System.out.println("update: обновить значение элемента коллекции, id которого равен заданному");
    }
}
