package it.paolomoschini.usermanagerrestrictions.userrestriction;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;

import it.paolomoschini.usermanagerrestrictions.receiver.MyDeviceAdminReceiver;


/**
 * Created by paolo on 20/01/16.
 */
public class UserRestriction {

    private static ComponentName deviceAdminComponentName;
    private static String currentRestrictionKey = "";

    public static void applyUserRestriction(Context context, String userManager_restrictionKey) {

        if (!currentRestrictionKey.isEmpty()) {
            clearLastUserRestriction(context);
        }

        if (deviceAdminComponentName == null) {
            deviceAdminComponentName = new ComponentName(context, MyDeviceAdminReceiver.class);
        }

        currentRestrictionKey = userManager_restrictionKey;

        DevicePolicyManager devicePolicyManager = (DevicePolicyManager)context.getSystemService(Context.DEVICE_POLICY_SERVICE);
        devicePolicyManager.addUserRestriction(deviceAdminComponentName, userManager_restrictionKey);
    }

    public static void clearLastUserRestriction(Context context) {
        if (deviceAdminComponentName == null) {
            deviceAdminComponentName = new ComponentName(context, MyDeviceAdminReceiver.class);
        }

        DevicePolicyManager devicePolicyManager = (DevicePolicyManager)context.getSystemService(Context.DEVICE_POLICY_SERVICE);
        devicePolicyManager.clearUserRestriction(deviceAdminComponentName,currentRestrictionKey);
    }

}
