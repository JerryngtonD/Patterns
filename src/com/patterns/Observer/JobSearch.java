package com.patterns.Observer;

public class JobSearch {
    public static void main(String... args) {
        JavaDevelopersJobSite site = new JavaDevelopersJobSite();

        site.addVacancy("Junior Java Developer");
        site.addVacancy("Middle Java Developer");

        Observer firstSubscriber = new Subscriber("Dima Mihailov");
        Observer secondSubscriber = new Subscriber("Alex Mishin");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Senior Java developer");

        site.removeVacancy("Middle Java Developer");

        site.removeObserver(firstSubscriber);
    }
}
