/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bast.patronmediator;

/**
 *
 * @author Ing Alberto Rodriguez
 */
public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        
        User user1 = new UserImpl(mediator, "Alberto");
        User user2 = new UserImpl(mediator, "Natalia");
        User user3 = new UserImpl(mediator, "Jesus");
        User user4 = new UserImpl(mediator, "Carlos");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user4.send("Hola buenos dias a todos.");
    }
}
