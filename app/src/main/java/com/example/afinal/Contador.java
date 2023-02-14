package com.example.afinal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
public class Contador extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Salida","Inicio del servicio");
        contar();
        Log.d("Salida","Finalizo del servicio");
        return START_STICKY;
    }

    public void contar()
    {
        for (int i = 1; i <= 10000; i++)
        {
            Log.d("Salida","contador: " + i);
        }
    }
}