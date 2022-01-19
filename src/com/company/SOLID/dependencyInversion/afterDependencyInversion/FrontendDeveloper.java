package com.company.SOLID.dependencyInversion.afterDependencyInversion;

public class FrontendDeveloper implements Developer {

    public void writeJavascript() {
        System.out.println("write javaScript code..");
    }

    @Override
    public void developer() {
        this.writeJavascript();
    }
}
