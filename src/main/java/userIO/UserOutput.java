package userIO;

public class UserOutput {

    public void welcomeScreen() {
        printBannerLine(Colors.Red);
        printBannerLine(Colors.Green);
        printBannerLine(Colors.Cyan);
        printBannerLine(Colors.Green);
        printBannerLine(Colors.Red);
        System.out.println(Colors.Cyan + "                              " + "WELCOME TO CONSOLEQUEST" + Colors.Reset);
        System.out.println(Colors.Cyan + "                              " + "PRESS (Y) TO CONTINUE!!" + Colors.Reset);
        System.out.println(Colors.Cyan + "                              " + "PRESS (N) TO EXIT!!!!!!" + Colors.Reset);
        printBannerLine(Colors.Red);
        printBannerLine(Colors.Green);
        printBannerLine(Colors.Cyan);
        printBannerLine(Colors.Green);
        printBannerLine(Colors.Red);
    }

    public void printBannerLine(Color selection) {
        System.out.println(selection + "|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|~_~|~^~|" + Colors.Reset);
    }

    public void characterRaceSelect() {
        printBannerLine(Colors.Red);
        printBannerLine(Colors.Green);
        printBannerLine(Colors.Cyan);
        System.out.println(Colors.Purple + "                              " + "Select Your Race" + Colors.Reset);
        System.out.println(Colors.Purple + "                              " + "1. Warrior" + Colors.Reset);
        System.out.println(Colors.Yellow + "Sword + Shield, +10% Physical Damage, +15% Heavy Armor, +15% Base Hitpoints" + Colors.Reset);
        System.out.println(Colors.Purple + "                              " + "2. Dark Elf (Mage)" + Colors.Reset);
        System.out.println(Colors.Yellow + "Staff + Orb, +10% Magic Damage, +15% Cloth Armor, +15% Base Mana" + Colors.Reset);
        System.out.println(Colors.Purple + "                              " + "3. Wood Elf (Rogue)" + Colors.Reset);
        System.out.println(Colors.Yellow + "Bow + Quiver, +10% Range Damage, +15% Light Armor, +15% Evade Chance" + Colors.Reset);
        printBannerLine(Colors.Cyan);
        printBannerLine(Colors.Green);
        printBannerLine(Colors.Red);
    }

}
