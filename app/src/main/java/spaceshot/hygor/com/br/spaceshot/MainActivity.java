package spaceshot.hygor.com.br.spaceshot;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import org.cocos2d.actions.interval.CCScaleBy;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.opengl.CCGLSurfaceView;

import spaceshot.hygor.com.br.spaceshot.scenes.TitleScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Orientação da tela
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        //Configuração da tela
        CCGLSurfaceView glView = new CCGLSurfaceView(this);
        setContentView(glView);
        CCDirector.sharedDirector().attachInView(glView);

        //Configuração Diretor
        CCDirector.sharedDirector().setScreenSize(320,480);

        //Abrir tela principal
        CCScene scene = new TitleScreen().scene();
        CCDirector.sharedDirector().runWithScene(scene);
    }
}
