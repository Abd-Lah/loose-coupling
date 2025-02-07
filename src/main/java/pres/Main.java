package pres;


import game.IGame;
import game.Standard;
import movement.IMovement;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("./config.txt"));
            String mouvementClass = in.nextLine();
            Class mv = Class.forName(mouvementClass);
            IMovement m = (IMovement) mv.newInstance();

            String wayOfPlay = in.nextLine();
            IGame wop = (IGame) Class.forName(wayOfPlay).getDeclaredConstructor(IMovement.class).newInstance(m);
            wop.play();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
