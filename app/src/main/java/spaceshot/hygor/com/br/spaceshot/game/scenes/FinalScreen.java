package spaceshot.hygor.com.br.spaceshot.game.scenes;

import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenHeight;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenResolution;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenWidth;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.sound.SoundEngine;
import org.cocos2d.types.CGPoint;

import spaceshot.hygor.com.br.spaceshot.R;
import spaceshot.hygor.com.br.spaceshot.config.Assets;
import spaceshot.hygor.com.br.spaceshot.game.control.Button;
import spaceshot.hygor.com.br.spaceshot.game.control.ButtonDelegate;
import spaceshot.hygor.com.br.spaceshot.screens.ScreenBackground;


public class FinalScreen extends CCLayer implements ButtonDelegate {

	private ScreenBackground background;
	private Button beginButton;
	
	public CCScene scene() {
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
	}
	
	public FinalScreen() {
		
		// background
		this.background = new ScreenBackground(Assets.BACKGROUND);
		this.background.setPosition(screenResolution(CGPoint.ccp(screenWidth() / 2.0f, screenHeight() / 2.0f)));
		this.addChild(this.background);
		
		// sound
		SoundEngine.sharedEngine().playSound(
				CCDirector.sharedDirector().getActivity(), R.raw.finalend, true);
		
		// image
		CCSprite title = CCSprite.sprite(Assets.FINALEND);
		title.setPosition(screenResolution(CGPoint.ccp( screenWidth() /2 , screenHeight() - 130 ))) ;
		this.addChild(title);
		
		// Enable Touch
		this.setIsTouchEnabled(true);
		this.beginButton = new Button(Assets.PLAY);
		this.beginButton.setPosition(screenResolution(CGPoint.ccp( screenWidth() /2 , screenHeight() - 300 ))) ;
		this.beginButton.setDelegate(this);
		addChild(this.beginButton);
	}

	@Override
	public void buttonClicked(Button sender) {
		if (sender.equals(this.beginButton)) {
			SoundEngine.sharedEngine().pauseSound();
			CCDirector.sharedDirector().replaceScene(new TitleScreen().scene());
		}		
	}	
	
}