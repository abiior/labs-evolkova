package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Show extends Command {
    private final CommandReciever commandReciever;

    public Show (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.show();
    }

    @Override
    protected void writeInfo() {
        System.out.println("show: вывести все элементы коллекции в строковом представлении.");
    }
}
