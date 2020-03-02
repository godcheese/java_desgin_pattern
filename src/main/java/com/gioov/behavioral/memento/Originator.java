package com.gioov.behavioral.memento;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2020-02-18
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void showState() {
        System.out.println(state);
    }
}
