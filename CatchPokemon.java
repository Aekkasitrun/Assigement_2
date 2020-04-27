import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatchPokemon extends JFrame{
    Pokemon pokemon;
    public CatchPokemon(Pokemon pokemon){
        super("Catch Pokemon");
        
        
        this.pokemon = pokemon;
        JLabel name = new JLabel(pokemon.getName());
        //JLabel hp = new JLabel("HP: " + pokemon.getHp());
        //JLabel sp = new JLabel("SP: " + pokemon.getSp());

        
       name.setBounds(0, 0, 50, 50);
       //sp.setBounds(0, 20, 50, 50);
       //hp.setLocation(200, 100);
        //sp.setLocation(300, 200);
        
        getContentPane().add(name);
        //getContentPane().add(hp);
        //getContentPane().add(sp);
        
        
        
        
        
        setSize(400, 200);
        setVisible(true);
    }
}