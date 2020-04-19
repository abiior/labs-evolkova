package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Save extends Command {
    private final CommandReciever commandReciever;

    public Save (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.save();
    }

    @Override
    protected void writeInfo() {
        System.out.println("save: сохранить в файл");
    }
}
