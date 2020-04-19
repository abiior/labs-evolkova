package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Add extends Command {
    private final CommandReciever commandReciever;

    public Add (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.add();
    }

    @Override
    protected void writeInfo() {
        System.out.println("add: добавить новый элемент в коллекцию");
    }
}
