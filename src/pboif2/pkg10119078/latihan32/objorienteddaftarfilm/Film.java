/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan32.objorienteddaftarfilm;

/**
 *
 * @author ryzen
 */
public class Film {
    public String name;
    public String genre;
    public double rating;
    public int duration;
    
public void setName(String name){
    this.name = name;
}     

public void setGenre (String genre){
    this.genre = genre;
}

public void setRating (double rating){
    this.rating = rating;
}

public void setDuration (int duration){
    this.duration = duration;
}

public void nowPlaying(){
    System.out.println("Judul Film\t: " + name);
    System.out.println("Genre Film\t: " + genre);
    System.out.println("Rating Film\t: " + rating);
    System.out.println("Duration Film\t: " + duration + " Menit" + "\n");

    
}
    
}
