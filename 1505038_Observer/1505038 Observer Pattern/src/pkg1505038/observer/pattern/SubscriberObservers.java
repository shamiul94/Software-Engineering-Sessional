/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505038.observer.pattern;

/**
 *
 * @author Heisenberg
 */
public class SubscriberObservers extends Observer {

    public SubscriberObservers(NewsSubject subject, String name) {
        this.subject = subject;
        this.userName = name;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        News.add(subject.getNews());
        System.out.println("Website subscriber " + this.userName + " has recieved a News.");
    }

    @Override
    public void Subscribe() {
        subject.addObserver(this);
        System.out.println(this.userName + " has subscribed to the channel as a Website subscriber.");

    }

    @Override
    public void unSubscribe() {
        subject.removeObserver(this);
        System.out.println(this.userName + " has unsubscribed from the channel as a Website subscriber.");
    }

    @Override
    public void accountUpdate(String notification) {
        Notification.add(notification);
    }

    @Override
    public void showAllNews() {
        int t = 0;
        for (String tem : News) {
            t++;
            System.out.println(t + ". " + tem);
        }
    }

    @Override
    public void showAllNotification() {
        int t = 0;
        for (String tem : Notification) {
            t++;
            System.out.println(t + ". " + tem);
        }
    }

}
