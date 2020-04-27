

public class Gardivoir extends Pokemon{
    public Gardivoir(String name){
        super(name, 300, 30);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(20);
    }
}