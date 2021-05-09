package GameProject.Concrete;

import GameProject.Abstract.BaseGameManager;
import GameProject.Entities.Concrete.Campaign;
import GameProject.Entities.Concrete.Game;
import GameProject.Entities.Concrete.Gamer;

public class GameManager extends BaseGameManager{

	@Override
	public void add(Game game) {
		super.add(game);
	}
	
	@Override
	public void delete(Game game) {
		super.delete(game);
	}
	
	@Override
	public void update(Game game) {
		super.update(game);
	}
	
	@Override 
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		double newPrice=game.getPrice() - ((game.getPrice() * campaign.getAmountOfDiscount())/ 100);
		System.out.println( game.getName()+ " has been sold to " + gamer.getFirstName() + " " + gamer.getLastName() + " with " + campaign.getName() + " campaign.");
		System.out.println( game.getName() + " price after discount " + newPrice);
	}
}