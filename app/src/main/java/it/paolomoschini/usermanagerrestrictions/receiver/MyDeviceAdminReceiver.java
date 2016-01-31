package it.paolomoschini.usermanagerrestrictions.receiver;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MyDeviceAdminReceiver extends DeviceAdminReceiver {

    //Called after the administrator is first enabled
    @Override
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context,intent);

        showToast(context, "DevieAdminReceiver Enabled");
    }

    //Called when the user has asked to disable the administrator
    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return "Administrator Disabled!";
    }

    //Called prior to the administrator being disabled
    @Override
    public void onDisabled(Context context, Intent intent) {
        super.onDisabled(context,intent);
    }

    @Override
    public void onPasswordChanged(Context context, Intent intent) {
        showToast(context, "DeviceAdminReceiver Password Changed");
    }

    void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLockTaskModeEntering(Context context, Intent intent, String pkg) {
        super.onLockTaskModeEntering(context, intent, pkg);
    }

    @Override
    public void onLockTaskModeExiting(Context context, Intent intent) {

    }
}
