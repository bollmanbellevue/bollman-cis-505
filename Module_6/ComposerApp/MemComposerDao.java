import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    public MemComposerDao() {
        composers = new ArrayList<Composer>();
        composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    public List<Composer> findAll() {
        return composers;
    }

    public Composer findBy(Integer key) {
        Composer match = new Composer();
        for (Composer composer : composers) {
            if (composer.getId() == key) {
                match = composer;
            }
        }

        return match;
    }

    public void insert(Composer composer) {
        composers.add(composer);
    }
}
