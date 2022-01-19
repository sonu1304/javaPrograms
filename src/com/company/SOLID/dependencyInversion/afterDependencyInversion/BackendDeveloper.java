package com.company.SOLID.dependencyInversion.afterDependencyInversion;

public class BackendDeveloper implements Developer {

    public void writeJava() {
        System.out.println("write java code..");
    }

    @Override
    public void developer() {
        this.writeJava();
    }
}
