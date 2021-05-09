package GameProject.Abstract;

import GameProject.Entities.Concrete.Campaign;
import GameProject.Entities.Concrete.Game;
import GameProject.Entities.Concrete.Gamer;

public interface GameService {

	void add(Game game);
    void update(Game game);
    void delete(Game game);  
    void sell(Game game, Gamer gamer,Campaign campaign);
}