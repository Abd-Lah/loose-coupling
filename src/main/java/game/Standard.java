package game;

import movement.IMovement;

public class Standard implements IGame {

    IMovement piece ;

    public Standard(IMovement piece) {
        this.piece = piece;
    }


    @Override
    public void play() {
        System.out.println("I'm playing Standard");
        piece.move();
    }
}
