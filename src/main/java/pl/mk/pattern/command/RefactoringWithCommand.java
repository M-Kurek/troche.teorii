package pl.mk.pattern.command;

import java.util.HashMap;
import java.util.Map;

public class RefactoringWithCommand {

    private static Map<String, Command> handlers;

    private enum Handlers { JOB, LOG};

    static {
        handlers = new HashMap<>();
        handlers.put(Handlers.LOG.name(), (new Command() {
            @Override
            public void execute(Map<String, String> parametersMap) {}
        }));
        handlers.put(Handlers.JOB.name(), (new Command() {
            @Override
            public void execute(Map<String, String> parametersMap) {}
        }));
    }

    public static Map<String, Command> getHandlers() {
        return handlers;
    }

    public interface Command {
        void execute(Map<String,String> parametersMap);
    }
}
