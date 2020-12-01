package com.company;

public class PhoneAccess implements IPhoneAccess {

    private IUnlockService _unlockService;

    public PhoneAccess(IUnlockService unlockService)
    {
        _unlockService = unlockService;
    }

    public Boolean UnlockPhone(String fingerCode)
    {
        var checkResult = _unlockService.CheckFingerPrintCode(fingerCode);

        if (!checkResult)
        {
            return false;
        }

        _unlockService.CheckInterface();
        var updateMessage = _unlockService.CheckUpdates();

        if (!updateMessage.equals(""))
        {
           System.out.println(updateMessage);
        }

        return true;
    }
}
