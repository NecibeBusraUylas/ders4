package GameProject.Abstract;

import GameProject.Entities.Concrete.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign)
    {
		System.out.println("Added Campaign: " + campaign.getName());
    }

	@Override
    public void delete(Campaign campaign)
    {
    	System.out.println("Deleted Campaign: " + campaign.getName());
    }

	@Override
    public void update(Campaign campaign)
    {
    	System.out.println("Updated Campaign: " + campaign.getName());
    }
}