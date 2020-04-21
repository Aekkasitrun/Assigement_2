

public class Pikachu extends Pokemon{
    public Pikachu(String name){
        super(name, 2000);
  
    }

    public Pikachu(String name, int maxHp){
        super(name, maxHp);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(100);
    }
}