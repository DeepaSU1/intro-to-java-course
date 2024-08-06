package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        SimpleContainer container = initialiseContainer();
        Game game = container.get(Game.class);
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }

    public static SimpleContainer initialiseContainer(){
        SimpleContainer container = new SimpleContainer();

        container.register(Game.class, DiceGame.class);
        container.register(Player.class, DicePlayer.class);
        return container;
    }
}
