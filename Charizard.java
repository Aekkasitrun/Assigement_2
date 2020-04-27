

public class Charizard extends Pokemon{
    public Charizard(String name){
        super(name, 200, 60);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(60);
    }
}