package com.patterns.Factory;


public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryByLang("Java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryByLang(String lang) {
        if(lang.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if(lang.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else {
            throw new RuntimeException("Provided language - " + lang + " is not found!");
        }
    }
}
