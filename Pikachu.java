

public class Pikachu extends Pokemon{
    public Pikachu(String name){
        super(name, 2000, 100);
  
    }

    public Pikachu(String name, int maxHp,int maxSp){
        super(name, maxHp, maxSp);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(100);
    }
}