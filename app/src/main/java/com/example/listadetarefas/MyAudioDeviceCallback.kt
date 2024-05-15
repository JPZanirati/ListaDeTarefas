import android.media.AudioDeviceInfo
import android.media.AudioManager

class MyAudioDeviceCallback : AudioManager.AudioDeviceCallback() {
    override fun onAudioDevicesAdded(addedDevices: Array<out AudioDeviceInfo>?) {
        super.onAudioDevicesAdded(addedDevices)
        // Lógica para lidar com dispositivos de áudio adicionados
    }

    override fun onAudioDevicesRemoved(removedDevices: Array<out AudioDeviceInfo>?) {
        super.onAudioDevicesRemoved(removedDevices)
        // Lógica para lidar com dispositivos de áudio removidos
    }
}