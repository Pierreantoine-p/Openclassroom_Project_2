package application;

import application.AnalyticsCounter;

public class Main {

    private Main() {
        throw new RuntimeException();
    }

    public static void main(final String[] args) {

        final AnalyticsCounter analitics = new AnalyticsCounter();
        analitics.analyse();
    }

}
