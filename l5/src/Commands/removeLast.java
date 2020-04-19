package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class removeLast extends Command {
    private final CommandReciever commandReciever;

    public removeLast (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.removeLast();
    }

    @Override
    protected void writeInfo() {
        System.out.println("remove_last: удалить последний элемент");
    }
}
