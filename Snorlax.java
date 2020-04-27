

public class Snorlax extends Pokemon{
    public Snorlax(String name){
        super(name, 100, 90);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(50);
    }
}