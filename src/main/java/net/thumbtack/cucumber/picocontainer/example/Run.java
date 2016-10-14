package net.thumbtack.cucumber.picocontainer.example;

import cucumber.api.cli.Main;

public class Run {
    public static void main(String[] args) throws Throwable {
        final String[] cucumberArgs = {
                "-g",
                "net.thumbtack.cucumber.picocontainer.example.step",
                "classpath:net/thumbtack/cucumber/picocontainer/example/feature"
        };

        Main.main(cucumberArgs);
    }
}
