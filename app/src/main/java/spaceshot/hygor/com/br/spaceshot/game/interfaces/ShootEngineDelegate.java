package spaceshot.hygor.com.br.spaceshot.game.interfaces;

import spaceshot.hygor.com.br.spaceshot.game.objects.Shoot;

public interface ShootEngineDelegate {
	public void createShoot(
            Shoot shoot);

	public void removeShoot(Shoot shoot);
}
