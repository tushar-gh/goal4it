package me.goal4it.goal4itclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuOutline {

    public static class Item {

        public String id;
        public String content;

        public Item(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static List<Item> ITEMS = new ArrayList<Item>();
    public static Map<String, Item> ITEM_MAP = new HashMap<String, Item>();

    static {
        addItem(new Item("1", "Login"));
        addItem(new Item("2", "Home"));
        addItem(new Item("3", "Feeds"));
    }

    private static void addItem(Item item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
}
