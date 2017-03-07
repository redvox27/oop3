package week3_ex3b;

/**
 * Created by Gebruiker on 7-3-2017.
 */
public class BurgerMain {

    public static void main(String[] args) {
        BigMac big = new BigMac();
        QuartePounder quad = new QuartePounder();

        big.prepareMeal();
        System.out.println();
        quad.prepareMeal();
    }

}
