/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505038.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heisenberg
 */
public abstract class Observer {

    List<String> News = new ArrayList<>();
    List<String> Notification = new ArrayList<>();
    protected String userName;
    protected NewsSubject subject;

    public abstract void update();

    public abstract void Subscribe();

    public abstract void unSubscribe();

    public abstract void accountUpdate(String notification);

    public abstract void showAllNews();

    public abstract void showAllNotification();
}
