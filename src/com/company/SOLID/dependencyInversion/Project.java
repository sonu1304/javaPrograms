package com.company.SOLID.dependencyInversion;

public class Project {

    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();
    private BackendDeveloper backendDeveloper = new BackendDeveloper();

    public void implement() {
        frontendDeveloper.writeJavascript();
        backendDeveloper.writeJava();
    }

}
