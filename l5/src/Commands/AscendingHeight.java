package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class AscendingHeight extends Command {
    private final CommandReciever commandReciever;

    public AscendingHeight (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.ascendingHeight();
    }

    @Override
    protected void writeInfo() {
        System.out.println("print_field_ascending_field: вывести значения height в порядке возрастания");
    }
}
