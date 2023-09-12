import java.util.ArrayList;
public class Database {
    private ArrayList<Superhero> heroList;

    public Database() {
        this.heroList = new ArrayList<>();
    }
    public void addHero(Superhero hero) {
        heroList.add(hero);
    }
    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }
}
