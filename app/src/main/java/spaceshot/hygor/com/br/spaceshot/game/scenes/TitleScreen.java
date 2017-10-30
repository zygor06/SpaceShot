package spaceshot.hygor.com.br.spaceshot.game.scenes;


import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;

import spaceshot.hygor.com.br.spaceshot.game.control.MenuButtons;
import spaceshot.hygor.com.br.spaceshot.screens.ScreenBackground;


public class TitleScreen extends CCLayer {

	private ScreenBackground background;
	
	public CCScene scene() {
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
	}

	public TitleScreen() {
			
		// exercicio 2
		// background
		// programe o background aqui
		
		// logo
		// programa o logo aqui
		
		// Add options layer
		MenuButtons menuLayer = new MenuButtons();
		this.addChild(menuLayer);
		
	}
}
