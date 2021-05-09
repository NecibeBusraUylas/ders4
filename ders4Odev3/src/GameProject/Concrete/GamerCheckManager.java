package GameProject.Concrete;

import GameProject.Abstract.GamerCheckService;
import GameProject.Entities.Concrete.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}
}