package com.barisaslankan.bluetoothchatapp.di

import dagger.hilt.InstallIn
import javax.inject.Singleton

import android.content.Context
import com.barisaslankan.bluetoothchatapp.data.chat.AndroidBluetoothController
import com.barisaslankan.bluetoothchatapp.domain.chat.BluetoothController
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBluetoothController(@ApplicationContext context: Context): BluetoothController {
        return AndroidBluetoothController(context)
    }
}