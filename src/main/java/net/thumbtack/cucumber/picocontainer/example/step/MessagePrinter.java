package net.thumbtack.cucumber.picocontainer.example.step;

import cucumber.api.java.en.Then;
import net.thumbtack.cucumber.picocontainer.example.util.Context;
import net.thumbtack.cucumber.picocontainer.example.util.Field;

public class MessagePrinter {
    private final Context context;

    public MessagePrinter(final Context context) {
        this.context = context;
    }

    @Then("^print this message$")
    public void printMessage() {
        final String message = context.getValue(Field.MESSAGE);

        System.out.println(message);
    }
}
