package com.barisaslankan.bluetoothchatapp.presentation

import com.barisaslankan.bluetoothchatapp.domain.chat.BluetoothDevice
import com.barisaslankan.bluetoothchatapp.domain.chat.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices : List<BluetoothDevice> = emptyList(),
    val pairedDevices : List<BluetoothDevice> = emptyList(),
    val isConnected : Boolean = false,
    val isConnecting : Boolean = false,
    val errorMessages : String? = null,
    val messages: List<BluetoothMessage> = emptyList()
)
