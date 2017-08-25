package DreamTeamGame;

import javafx.util.Pair;

import java.util.ArrayList;

public class Map {
    private ArrayList<ArrayList<Pair<Integer, Integer>>> map; // лучше переделать через пары

    private int size;
    private ArrayList<Character> alph;
    public Map(int size, ArrayList<ArrayList<Pair<Integer, Integer>>> map, ArrayList<Character> alph){
        this.size = size;
        this.map = map;
        this.alph = alph;
    }
    public Map(ArrayList<ArrayList<Pair<Integer, Integer>>> map, int size, ArrayList<Character> alph) {
        this.map = map;
        this.size = size;
        this.alph = alph;
    }
    public int getSize() {
        return this.size;
    }
    public ArrayList<ArrayList<Pair<Integer, Integer>>> getMap(){
        return this.map;
    }
    public ArrayList<Character> getAlph(){
        return this.alph;
    }

}
