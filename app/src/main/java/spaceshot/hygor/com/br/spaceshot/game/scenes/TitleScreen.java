package spaceshot.hygor.com.br.spaceshot.game.scenes;


import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

import spaceshot.hygor.com.br.spaceshot.config.Assets;
import spaceshot.hygor.com.br.spaceshot.game.control.MenuButtons;
import spaceshot.hygor.com.br.spaceshot.screens.ScreenBackground;

import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenHeight;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenResolution;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenWidth;


public class TitleScreen extends CCLayer {

	private ScreenBackground background;
	
	public CCScene scene() {
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
	}

	public TitleScreen() {

		this.background = new ScreenBackground(Assets.BACKGROUND);
		this.background.setPosition(
				screenResolution(CGPoint.ccp(
						CCDirector.sharedDirector().winSize().width / 2.0f,
						CCDirector.sharedDirector().winSize().height / 2.0f
				)));
		this.addChild(this.background);

		CCSprite title = CCSprite.sprite(Assets.LOGO);
		title.setPosition(screenResolution(
				CGPoint.ccp( screenWidth() /2 , screenHeight() - 130 )));
		this.addChild(title);
		
		// Add options layer
		MenuButtons menuLayer = new MenuButtons();
		this.addChild(menuLayer);
		
	}
}
