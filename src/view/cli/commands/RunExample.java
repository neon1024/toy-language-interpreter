package view.cli.commands;

import controller.Controller;
import exception.InterpreterException;

public class RunExample extends Command {
    private final Controller controller;

    public RunExample(String id, String description, Controller controller) {
        super(id, description);
        this.controller = controller;
    }

    @Override
    public void execute() {
        try {
            this.controller.allSteps();
        } catch (InterpreterException e) {
            System.out.println("Something went wrong! " + e.getMessage());
        }
    }
}