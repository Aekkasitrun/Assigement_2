import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatchPokemon extends JFrame{
    PokemonRandomizer pokemon;
    public CatchPokemon(PokemonRandomizer pokemon){
        super("Catch Pokemon");
        
        String pName = "Current Wild Pokemon";

        this.pokemon = pokemon;
        JLabel name;
        JLabel pokemonName = new JLabel();
        pokemonName.setText(pName);
        

        
        
        
        
        
        setSize(600, 400);
        setVisible(true);
    }
}