package GameProject.Abstract;

import GameProject.Entities.Concrete.Campaign;

public interface CampaignService {

	void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}