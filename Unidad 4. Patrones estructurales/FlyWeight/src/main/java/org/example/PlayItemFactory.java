package org.example;

import java.util.HashMap;
import java.util.Map;

public class PlayItemFactory {

    public static boolean enableFlyWeight = true;
    public static int totalCompartidas = 0;
    public static int totalCreadas = 0;
    public static final Map<String, ItemPlayList> ITEM_PLAY_LIST= new HashMap<>();
    private static Long idSequence=0L;

    public static ItemPlayList createItemPlayList(String songName){
        if(enableFlyWeight && ITEM_PLAY_LIST.containsKey(songName)){
            totalCompartidas++;
            return ITEM_PLAY_LIST.get(songName);
        }
        else{
            totalCreadas++;
            ItemPlayList itemPlayList = new ItemPlayList(++idSequence,songName);
            ITEM_PLAY_LIST.put(songName, itemPlayList);
            return itemPlayList;
        }
    }

}
