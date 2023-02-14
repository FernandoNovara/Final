package com.example.afinal;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;

public class Proximidad implements SensorEventListener {
    private int cont = 0;
    private Context context;

    public Proximidad(Context context)
    {
        this.context = context;
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if(event.sensor.isWakeUpSensor() && cont == 0)
        {
            Intent i = new Intent(context ,Contador.class);
            context.startService(i);
            cont = 1;
        }
        else
        {
            cont = 0;
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}


