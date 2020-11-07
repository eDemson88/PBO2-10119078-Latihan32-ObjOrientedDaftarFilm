/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk menampilkan film yang sedang tayang
 */
package pboif2.pkg10119078.latihan32.objorienteddaftarfilm;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan32ObjOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Daftar Film Sedang Tayang=====\n" );
            
        Film mov1 = new Film();
        mov1.setName("Venom");
        mov1.setGenre("Action, Horror, SciFi");
        mov1.setRating(8.5);
        mov1.setDuration(120);
        mov1.nowPlaying();
        
        Film mov2 = new Film();
        mov2.setName("Small Foot");
        mov2.setGenre("Animation");
        mov2.setRating(9.0);
        mov2.setDuration(96);
        mov2.nowPlaying();
        
        Film mov3 = new Film();
        mov3.setName("Crazy Rich Asian");
        mov3.setGenre("Comedy");
        mov3.setRating(7.8);
        mov3.setDuration(119);
        mov3.nowPlaying();
        
        Film mov4 = new Film();
        mov4.setName("Asih");
        mov4.setGenre("Horror");
        mov4.setRating(6.0);
        mov4.setDuration(100);
        mov4.nowPlaying();
        
        
        
    }
    
}
