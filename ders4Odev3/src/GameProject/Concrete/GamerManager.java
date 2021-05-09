package GameProject.Concrete;

import GameProject.Abstract.BaseGamerManager;
import GameProject.Abstract.GamerCheckService;
import GameProject.Entities.Concrete.Gamer;

public class GamerManager extends BaseGamerManager {

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer){
		try {
			if(gamerCheckService.CheckIfRealPerson(gamer)) {
				super.add(gamer);
				}
		}
		catch(Exception e){
			System.out.println("Gamer validation error!");
		}
		
	}
	
	@Override
	public void delete(Gamer gamer) {
		super.delete(gamer);
	}
	
	@Override
	public void update(Gamer gamer) {
		super.update(gamer);
	}
}