package spaceshot.hygor.com.br.spaceshot.game.objects;

import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenHeight;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenWidth;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.opengl.CCBitmapFontAtlas;

import spaceshot.hygor.com.br.spaceshot.game.scenes.GameScene;


public class Score  extends CCLayer {
	
	private int score;
	private CCBitmapFontAtlas text;
	
	private GameScene delegate;
	
	public void setDelegate(GameScene delegate) {
		this.delegate = delegate;
	}

	public Score(){
		this.score = 0;

		this.text = CCBitmapFontAtlas.bitmapFontAtlas(
				String.valueOf(this.score),
				"UniSansSemiBold_Numbers_240.fnt");
		
		this.text.setScale((float) 240 / 240);
		
		this.setPosition(screenWidth()-50, screenHeight()-50);
		this.addChild(this.text);
	}

	public void increase() {
		score++;		
		this.text.setString(String.valueOf(this.score)); 
		
		if(score==5){
			this.delegate.startFinalScreen();
		}
		
	}
	
}
