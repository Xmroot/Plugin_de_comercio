package dev.xmroot.comercio;

import dev.xmroot.comercio.Vender;


public class Strings {
    public static String Itemvender1;
    public static void loadString() {
        Itemvender1 = Vender.getInstance().getConfig().getString("Item").replace("&", "§");
    }
}
