import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatchPokemon extends JFrame{
    PokemonRandomizer pokemon;
    public CatchPokemon(PokemonRandomizer pokemon){
        super("Catch Pokemon");
        setSize(400, 200);
        setVisible(true);
    }
}