package ru.gravit.launchserver.console;

import ru.gravit.utils.command.Command;

public class ExitCommand extends Command {
    public ExitCommand() {
    }

    @Override
    public String getArgsDescription() {
        return null;
    }

    @Override
    public String getUsageDescription() {
        return null;
    }

    @Override
    public void invoke(String... args) throws Exception {
        System.exit(0);
    }
}
