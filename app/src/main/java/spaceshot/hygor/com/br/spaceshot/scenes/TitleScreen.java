package spaceshot.hygor.com.br.spaceshot.scenes;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.types.CGPoint;

import spaceshot.hygor.com.br.spaceshot.config.Assets;
import spaceshot.hygor.com.br.spaceshot.sprites.BackgroundScreen;

import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenHeight;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenWidth;

/**
 * Created by Hygor Dias on 25/10/2017.
 */

public class TitleScreen extends CCLayer {

    private BackgroundScreen background;

    public TitleScreen(){
        this.background = new BackgroundScreen(Assets.BACKGROUND);
        this.background.setPosition(
                screenResolution(CGPoint.ccp(
                        screenWidth()/2.0f,
                        screenHeight()/2.0f
                )));
        this.addChild(this.background);
    }

    private CGPoint screenResolution(CGPoint ccp) {
        return ccp;
    }

    public CCScene scene(){
        CCScene scene = CCScene.node();
        scene.addChild(this);
        return scene;
    }

}
