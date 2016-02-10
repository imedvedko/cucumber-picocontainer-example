package net.thumbtack.cucumber.picocontainer.example;

import cucumber.api.java.en.When;
import net.thumbtack.cucumber.picocontainer.example.util.Context;
import net.thumbtack.cucumber.picocontainer.example.util.Field;

public class MessageCreator {
    private static final String MESSAGE = "Hello, World!";

    private final Context context;

    public MessageCreator(final Context context) {
        this.context = context;
    }

    @When("message is created")
    public void createMessage() {
        context.setValue(Field.MESSAGE, MESSAGE);
    }
}
