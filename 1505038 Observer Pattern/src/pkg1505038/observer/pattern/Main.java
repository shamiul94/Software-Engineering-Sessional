/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505038.observer.pattern;

import java.util.Scanner;

/**
 *
 * @author Heisenberg
 */
public class Main {

    public static void main(String[] args) {
        NewsSubject BBC = new NewsSubject();
        System.out.println("Welcome to BBC -");

        while (true) {
            System.out.println("What do you want to use as? :");
            System.out.println("1. Admin\n2. User");
            Scanner in = new Scanner(System.in);
            int ch = in.nextInt();

            if (ch == 1) {
                String news;

                System.out.println("1. Publish a news\n2. Ban a user\n3. Show All Users");

                ch = in.nextInt();

                if (ch == 1) {
                    System.out.println("Enter the news: ");
                    in.useDelimiter("#");
                    Scanner in2 = new Scanner(System.in);
                    news = in2.next();

                    BBC.publishNews(news);
                } else if (ch == 2) {
                    BBC.showAllObservers();
                    System.out.println("Enter user's name to ban: ");
                    in.useDelimiter("\n");
                    String name;
                    name = in.next();

                    BBC.banObserver(name);
                } else if (ch == 3) {
                    BBC.showAllObservers();
                } else {
                    System.out.println("Invalid choice.");
                }

            } else if (ch == 2) {
                System.out.println("1. Sign Up\n2. Log In");

                int ch2;
                Scanner in3 = new Scanner(System.in);
                ch2 = in3.nextInt();

                String Name;

                System.out.println("Enter your user name: ");
                in.useDelimiter("\n");
                Name = in.next();

                if (ch2 == 1) {

                    System.out.println("You want to continue as a - ");
                    System.out.println("1. Website User\n2. Facebook User\n"
                            + "3. Twitter User\n4. LinkedIn User");

                    ch2 = in.nextInt();
                    if (ch2 == 1) {

                        SubscriberObservers sub = new SubscriberObservers(BBC, Name);
                    } else if (ch2 == 2) {
                        FacebookObservers fb = new FacebookObservers(BBC, Name);
                    } else if (ch2 == 3) {
                        TwitterObservers twit = new TwitterObservers(BBC, Name);
                    } else if (ch2 == 4) {
                        LinkedInObservers link = new LinkedInObservers(BBC, Name);
                    } else {
                        System.out.println("Invalid choice.");
                    }

                } else if (ch2 == 2) {

                    Observer ob = BBC.checkSubscribe(Name);
                    if (ob == null) {
                        System.out.println("You are not subscribed to this channel. Sign Up first.");
                    } else {
                        System.out.println("You are logged in.");
                        System.out.println("1. Read All News.\n2. Read account notification.\n"
                                + "3. Unsubscribe");

                        int ch4 = in.nextInt();

                        if (ch4 == 1) {
                            ob.showAllNews();
                        } else if (ch4 == 2) {
                            ob.showAllNotification();
                        } else if (ch4 == 3) {
                            ob.unSubscribe();
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }

                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
