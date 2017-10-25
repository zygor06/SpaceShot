package spaceshot.hygor.com.br.spaceshot.config;

import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

import android.hardware.SensorManager;

/**
 * Created by Hygor Dias on 25/10/2017.
 * ~github.com/zygor06
 */

public class DeviceSettings {

    private static SensorManager sensormanager;

    public static void setSensorManager(SensorManager sensorManagerRef) {
        sensormanager = sensorManagerRef;
    }

    public static CGPoint screenResolution(CGPoint gcPoint) {
        return gcPoint;
    }

    public static float screenWidth() {
        return winSize().width;
    }

    public static float screenHeight() {
        return winSize().height;
    }

    public static CGSize winSize() {
        return CCDirector.sharedDirector().winSize();
    }

    public static SensorManager getSensormanager() {
        return sensormanager;
    }


}