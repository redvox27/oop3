package week3_ex3b;

/**
 * Created by Gebruiker on 7-3-2017.
 */
public abstract class Burger {

    protected void prepareMeal(){
        fryBurger();
        addFirstBun();
        decorateBurger();
        addLastBun();
    }

    protected void fryBurger(){
        System.out.println("the burger is being smacked in the pan");
    }

    protected void addFirstBun(){
        System.out.println("Bottom bun is being placed");
    }

    protected void addLastBun(){
        System.out.println("Top bun is being placed");
    }

    protected abstract void decorateBurger();




}
