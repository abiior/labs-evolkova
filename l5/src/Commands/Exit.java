package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class Exit extends Command {
    private final CommandReciever commandReciever;

    public Exit (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Опаньки! Что-то пошло не так");
        }
        commandReciever.exit();
    }

    @Override
    protected void writeInfo() {
        System.out.println("exit: завершить без сохранения");
    }
}
