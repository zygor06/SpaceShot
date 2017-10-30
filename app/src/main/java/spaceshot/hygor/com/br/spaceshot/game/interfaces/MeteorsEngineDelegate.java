package spaceshot.hygor.com.br.spaceshot.game.interfaces;

import spaceshot.hygor.com.br.spaceshot.game.objects.Meteor;

public interface MeteorsEngineDelegate {
	public void createMeteor(Meteor meteor);
	public void removeMeteor(Meteor meteor);
}
