package spaceshot.hygor.com.br.spaceshot.game.control;

import org.cocos2d.layers.CCLayer;

import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenHeight;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenResolution;
import static spaceshot.hygor.com.br.spaceshot.config.DeviceSettings.screenWidth;

import org.cocos2d.types.CGPoint;

import spaceshot.hygor.com.br.spaceshot.config.Assets;


public class MenuButtons extends CCLayer implements ButtonDelegate {

    private Button playButton;
    private Button highscoredButton;

    public MenuButtons() {

        // Enable Touch
        this.setIsTouchEnabled(true);

        // Create Buttons
        this.playButton 	  = new Button(Assets.PLAY);
        this.highscoredButton = new Button(Assets.HIGHSCORE);

        // Set Buttons Delegates
        this.playButton.setDelegate(this);
        this.highscoredButton.setDelegate(this);

        // set position
        setButtonspPosition();

        // Add Buttons to Screen
        addChild(playButton);
        addChild(highscoredButton);

    }

    private void setButtonspPosition() {

        // Buttons Positions
        playButton.setPosition(screenResolution(CGPoint.ccp( screenWidth() /2 , screenHeight() - 250 ))) ;
        highscoredButton.setPosition(screenResolution(CGPoint.ccp( screenWidth() /2 , screenHeight() - 300 ))) ;
    }

    @Override
    public void buttonClicked(Button sender) {

        if (sender.equals(this.playButton)) {
            System.out.println("Button clicked: Play");

            // exercicio 3
            // direcione para a tela do game


        }

        if (sender.equals(this.highscoredButton)) {
            System.out.println("Button clicked: Highscore");
        }

    }

}