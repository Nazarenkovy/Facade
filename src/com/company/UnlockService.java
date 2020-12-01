package com.company;
import java.util.ArrayList;

public class UnlockService implements IUnlockService{

    public Boolean CheckFingerPrintCode(String code)
    {
        var fingers = new ArrayList<String>();

        fingers.add("73074brbaccpauraiuofacfb");
        fingers.add("3be732cbrtw7fyewc");
        fingers.add("yiuyhjb324wsfds");

        if (fingers.contains(code))
        {
            return true;
        }

        return false;
    }

    public Boolean CheckInterface()
    {
        System.out.println("Interface was checked. Everything is OK.");
        return true;
    }

    public String CheckUpdates()
    {
        return "You can update to IOS 15";
    }
}
