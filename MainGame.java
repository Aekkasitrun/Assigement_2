import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainGame extends JFrame{ 
    
    private Trainer trainer;
    private PokemonRandomizer pokemonRandomizer;
    private ArrayList<Pokemon> pokemons;

    public MainGame(Trainer trainer){
        super("Pokemon Game");
        
        this.trainer = trainer;
        this.pokemonRandomizer = pokemonRandomizer;
        this.pokemons = pokemons;
       
        Container c = getContentPane();
        JLabel trainerNameLabel = new JLabel(this.trainer.getName());
        JLabel pokemonName = new JLabel();
        
        JButton firstPokemon = new JButton(trainer.getBag().get(0).getName() + " Status");
        JButton catchPokemon = new JButton("Catch Pokemon");
        
        c.add(trainerNameLabel);
        c.add(pokemonName);
        c.add(firstPokemon);
        c.add(catchPokemon);
        

        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        

        String pName = "Pokemon: ";
        for(Pokemon p: trainer.getBag()){
            pName += p.getName() + ", ";

        }

        pokemonName.setText(pName);

        firstPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
               // CatchPokemon cp = new CatchPokemon(trainer.getBag().get(0));
            }
        });

        catchPokemon.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //PokemonStatus ps = new PokemonStatus(trainer.getBag().get(0));
               CatchPokemon cp = new CatchPokemon(pokemonRandomizer);
            }
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
}