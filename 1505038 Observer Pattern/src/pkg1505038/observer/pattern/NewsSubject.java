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
public class NewsSubject {

    private List<Observer> list = new ArrayList<>();
    String News;

    public String getNews() {
        return News;
    }

    public Observer checkSubscribe(String Name) {
        for (Observer tem : list) {

            System.out.println(tem.userName);
            if (tem.userName.equals(Name)) {
                return tem;
            }
        }
        return null;
    }

    public void publishNews(String news) {
        News = news;
        notifyAllObservers();
        System.out.println("News is published.");
    }

    public void addObserver(Observer observer) {
        for (Observer tem : list) {
            if (tem.userName.equals(observer.userName)) {
                System.out.println("Another person with username " + tem.userName
                        + " already exists. Try again.");
                return;
            }
        }

        list.add(observer);
        System.out.println("You successfully Signed up.");
        return;
    }

    public void removeObserver(Observer ob) {
        for (Observer tem : list) {
            if (tem.userName.equals(ob.userName)) {
                list.remove(tem);
                notifySingleObserver(ob, "You have unsubscribed.");
                return;
            }
        }

        System.out.println(ob.userName + " wasn't a sunscriber. So, this person can't be removed.");
        return;
    }

    public void banObserver(String Name) {
        
        for (Observer tem : list) {
            if (tem.userName.equals(Name)) {
                list.remove(tem);
                System.out.println(Name + " has been banned.");
                notifySingleObserver(tem, "You have been banned.");
                return;
            }
        }

        System.out.println(Name + " isn't your sunscriber. So, you can't ban this observer.");
        return;
    }

    public void notifyAllObservers() {
        for (Observer tem : list) {
            tem.update();
        }
        System.out.println("All observer Notified.");
    }

    public void notifySingleObserver(Observer observer, String notification) {
        observer.accountUpdate(notification);
    }
    
    public void showAllObservers() {
        int t = 0;
        for (Observer tem : list) {
            t++;
            System.out.println(t + ". " + tem.userName);
        }
    }
}
