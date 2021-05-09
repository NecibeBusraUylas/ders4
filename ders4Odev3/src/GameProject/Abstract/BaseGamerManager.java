package GameProject.Abstract;

import GameProject.Entities.Concrete.Gamer;

public abstract class BaseGamerManager implements GamerService{

	@Override
	public void add(Gamer gamer){
		
		System.out.println("Gamer saved: "  + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Gamer deleted: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Gamer updated: " +  gamer.getFirstName() + " " + gamer.getLastName());
		
	}
}