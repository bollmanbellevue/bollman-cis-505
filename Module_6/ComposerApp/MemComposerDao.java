/*
    Krasso, R., (2022). CIS 505 Intermediate Java Programming. Bellevue University, all
        rights reserved.
    Modified by J. Bollman 2022
 */

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    public MemComposerDao() {
        // Instantiate a list and add 5 composers.
        composers = new ArrayList<Composer>();
        composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    /** 
     * Implements the interface ComposerDao findAll method.
     * @return List<Composer>
     */
    public List<Composer> findAll() {
        return composers;
    }

    /** 
     * Implements the interface ComposerDao findBy method.
     * @param key - The composer Id.
     * @return Composer
     */
    public Composer findBy(Integer key) {
        Composer match = new Composer(); // Create a default composer as the return for no match.

        // Loop through the list of composers and return the one that matches the provided id.
        for (Composer composer : composers) {
            if (composer.getId() == key) {
                match = composer;
                break;
            }
        }

        return match;
    }

    /** 
     * Implements the interface ComposerDao insert method.
     * @param composer
     */
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
