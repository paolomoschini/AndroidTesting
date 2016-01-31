package it.paolomoschini.usermanagerrestrictions.userrestriction;

import java.util.ArrayList;

/**
 * Created by paolo on 20/01/16.
 */
public class UserManager {

    private String type;
    private String description;

    public UserManager(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public static ArrayList<UserManager> userManagersFactory() {
        ArrayList<UserManager> userManagerArrayList = new ArrayList<>();

        UserManager allowParentProfileAppLinking = new UserManager(android.os.UserManager.ALLOW_PARENT_PROFILE_APP_LINKING,
                "Allows apps in the parent profile to handle web links from the managed profile.");
        userManagerArrayList.add(allowParentProfileAppLinking);

        UserManager disallowAddUser = new UserManager(android.os.UserManager.DISALLOW_ADD_USER,
                "Specifies if a user is disallowed from adding new users and profiles.");
        userManagerArrayList.add(disallowAddUser);

        UserManager disallowAdjustVolume = new UserManager(android.os.UserManager.DISALLOW_ADJUST_VOLUME,
                "Specifies if a user is disallowed from adjusting the master volume.");
        userManagerArrayList.add(disallowAdjustVolume);

        UserManager disallowAppControl = new UserManager(android.os.UserManager.DISALLOW_APPS_CONTROL,
                "Specifies if a user is disallowed from modifying applications in Settings or launchers.");
        userManagerArrayList.add(disallowAppControl);

        UserManager disallowConfigBluetooth = new UserManager(android.os.UserManager.DISALLOW_CONFIG_BLUETOOTH,
                "Specifies if a user is disallowed from configuring bluetooth.");
        userManagerArrayList.add(disallowConfigBluetooth);

        UserManager disallowConfigCellBroadcast = new UserManager(android.os.UserManager.DISALLOW_CONFIG_CELL_BROADCASTS,
                "Specifies if a user is disallowed from configuring cell broadcasts.");
        userManagerArrayList.add(disallowConfigCellBroadcast);

        UserManager disallowConfigCredentials = new UserManager(android.os.UserManager.DISALLOW_CONFIG_CREDENTIALS,
                "Specifies if a user is disallowed from configuring user credentials.");
        userManagerArrayList.add(disallowConfigCredentials);

        UserManager disallowConfigMobileNetworks = new UserManager(android.os.UserManager.DISALLOW_CONFIG_MOBILE_NETWORKS,
                "Specifies if a user is disallowed from configuring mobile networks.");
        userManagerArrayList.add(disallowConfigMobileNetworks);

        UserManager disallowConfigTethering = new UserManager(android.os.UserManager.DISALLOW_CONFIG_TETHERING,
                "Specifies if a user is disallowed from configuring Tethering & portable hotspots.");
        userManagerArrayList.add(disallowConfigTethering);

        UserManager disallowConfigVPN = new UserManager(android.os.UserManager.DISALLOW_CONFIG_VPN,
                "Specifies if a user is disallowed from configuring VPN.");
        userManagerArrayList.add(disallowConfigVPN);

        UserManager disallowConfigWiFi = new UserManager(android.os.UserManager.DISALLOW_CONFIG_WIFI,
                "Specifies if a user is disallowed from changing Wi-Fi access points.");
        userManagerArrayList.add(disallowConfigWiFi);

        UserManager disallowCreateWindows = new UserManager(android.os.UserManager.DISALLOW_CREATE_WINDOWS,
                "Specifies that windows besides app windows should not be created.");
        userManagerArrayList.add(disallowCreateWindows);

        UserManager disallowCrossProfileCopyPaste = new UserManager(android.os.UserManager.DISALLOW_CROSS_PROFILE_COPY_PASTE,
                "Specifies if what is copied in the clipboard of this profile can be pasted in related profiles.");
        userManagerArrayList.add(disallowCrossProfileCopyPaste);

        UserManager disallowDebuggingFeatures = new UserManager(android.os.UserManager.DISALLOW_DEBUGGING_FEATURES,
                "Specifies if a user is disallowed from enabling or accessing debugging features.");
        userManagerArrayList.add(disallowDebuggingFeatures);

        UserManager disallowFactoryReset = new UserManager(android.os.UserManager.DISALLOW_FACTORY_RESET,
                "Specifies if a user is disallowed from factory resetting from Settings.");
        userManagerArrayList.add(disallowFactoryReset);

        UserManager disallowFun = new UserManager(android.os.UserManager.DISALLOW_FUN,
                "Specifies if the user is not allowed to have fun.");
        userManagerArrayList.add(disallowFun);

        UserManager disallowInstallApps = new UserManager(android.os.UserManager.DISALLOW_INSTALL_APPS,
                "Specifies if a user is disallowed from installing applications.");
        userManagerArrayList.add(disallowInstallApps);

        UserManager disallowInstallUnknowSources = new UserManager(android.os.UserManager.DISALLOW_INSTALL_UNKNOWN_SOURCES,
                "Specifies if a user is disallowed from enabling the \"Unknown Sources\" setting, that allows installation of apps from unknown sources.");
        userManagerArrayList.add(disallowInstallUnknowSources);

        UserManager disallowModifyAccounts = new UserManager(android.os.UserManager.DISALLOW_MODIFY_ACCOUNTS,
                "Specifies if a user is disallowed from adding and removing accounts, unless they are programmatically added by Authenticator.");
        userManagerArrayList.add(disallowModifyAccounts);

        UserManager disallowMountPhisicalMedia = new UserManager(android.os.UserManager.DISALLOW_MOUNT_PHYSICAL_MEDIA,
                "Specifies if a user is disallowed from mounting physical external media.");
        userManagerArrayList.add(disallowMountPhisicalMedia);

        UserManager disallowNetworkReset = new UserManager(android.os.UserManager.DISALLOW_NETWORK_RESET,
                "Specifies if a user is disallowed from resetting network settings from Settings.");
        userManagerArrayList.add(disallowNetworkReset);

        UserManager disallowOutgoingBeam = new UserManager(android.os.UserManager.DISALLOW_OUTGOING_BEAM,
                "Specifies if the user is not allowed to use NFC to beam out data from apps.");
        userManagerArrayList.add(disallowOutgoingBeam);

        UserManager disallowOutgoingCalls = new UserManager(android.os.UserManager.DISALLOW_OUTGOING_CALLS,
                "Specifies that the user is not allowed to make outgoing phone calls.");
        userManagerArrayList.add(disallowOutgoingCalls);

        UserManager disallowRemoveUser = new UserManager(android.os.UserManager.DISALLOW_REMOVE_USER,
                "When set on the primary user this specifies if the user can remove other users.");
        userManagerArrayList.add(disallowRemoveUser);

        UserManager disallowSafeBoot = new UserManager(android.os.UserManager.DISALLOW_SAFE_BOOT,
                "Specifies if the user is not allowed to reboot the device into safe boot mode.");
        userManagerArrayList.add(disallowSafeBoot);

        UserManager disallowShareLocation = new UserManager(android.os.UserManager.DISALLOW_SHARE_LOCATION,
                "Specifies if a user is disallowed from turning on location sharing.");
        userManagerArrayList.add(disallowShareLocation);

        UserManager disallowSMS = new UserManager(android.os.UserManager.DISALLOW_SMS,
                "Specifies that the user is not allowed to send or receive SMS messages.");
        userManagerArrayList.add(disallowSMS);

        UserManager disallowUninstallApps = new UserManager(android.os.UserManager.DISALLOW_UNINSTALL_APPS,
                "Specifies if a user is disallowed from uninstalling applications.");
        userManagerArrayList.add(disallowUninstallApps);

        UserManager disallowUnmuteMicrophone = new UserManager(android.os.UserManager.DISALLOW_UNMUTE_MICROPHONE,
                "Specifies if a user is disallowed from adjusting microphone volume.");
        userManagerArrayList.add(disallowUnmuteMicrophone);

        UserManager disallowUSBFileTransfer = new UserManager(android.os.UserManager.DISALLOW_USB_FILE_TRANSFER,
                "Specifies if a user is disallowed from transferring files over USB.");
        userManagerArrayList.add(disallowUSBFileTransfer);

        UserManager ensureVerifyApps = new UserManager(android.os.UserManager.ENSURE_VERIFY_APPS,
                "Specifies if a user is disallowed from disabling application verification.");
        userManagerArrayList.add(ensureVerifyApps);


        return userManagerArrayList;

    }

}
