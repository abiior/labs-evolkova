package Commands;

import com.company.Command;
import com.company.CommandReciever;

public class RemoveByID extends Command {
    private final CommandReciever commandReciever;

    public RemoveByID (CommandReciever commandReciever) {
        this.commandReciever = commandReciever;
    }

    @Override
    protected void execute(String[] args) {
        if (args.length == 2) { commandReciever.remove_by_id(args[1]); }
        else { System.out.println("Некорректное количество аргументов. Для справки напишите help."); }
    }


    @Override
    protected void writeInfo() {
        System.out.println("remove_by_id: удалитб элемент по id");
    }
}

