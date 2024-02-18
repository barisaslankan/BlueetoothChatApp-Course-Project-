package com.barisaslankan.bluetoothchatapp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.barisaslankan.bluetoothchatapp.domain.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain() : BluetoothDeviceDomain{
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}