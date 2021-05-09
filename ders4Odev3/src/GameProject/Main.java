package GameProject;

import GameProject.Abstract.BaseCampaignManager;
import GameProject.Abstract.BaseGameManager;
import GameProject.Abstract.BaseGamerManager;
import GameProject.Adapters.MernisServiceAdapter;
import GameProject.Concrete.CampaignManager;
import GameProject.Concrete.GameManager;
import GameProject.Concrete.GamerManager;
import GameProject.Entities.Concrete.Campaign;
import GameProject.Entities.Concrete.Game;
import GameProject.Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
	
		BaseGameManager baseGameManager=new GameManager();
		BaseGamerManager baseGamerManager=new GamerManager(new MernisServiceAdapter());
		BaseCampaignManager baseCampaignManager=new CampaignManager();
		
		Gamer gamer=new Gamer(1,"11111111111", "Büþra", "Uylaþ", 1998);
		baseGamerManager.add(gamer);
		Game game=new Game(1,"Detroit:Become Human","Action",100);
		baseGameManager.add(game);
		Campaign campaign=new Campaign(1, "The boss going crazy", 30);
		baseCampaignManager.add(campaign);
		
		baseGameManager.sell(game, gamer, campaign);
	}
}