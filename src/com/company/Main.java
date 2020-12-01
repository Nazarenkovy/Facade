package com.company;

public class Main {

    public static void main(String[] args) {

        var unlockService = new UnlockService();
        var phoneAccess = new PhoneAccess(unlockService);

        phoneAccess.UnlockPhone("73074brbaccpauraiuofacfb");
    }
}
