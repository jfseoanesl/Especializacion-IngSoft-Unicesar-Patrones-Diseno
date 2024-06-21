package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private String playListName;
    private List<ItemPlayList> playListItems = new ArrayList<>();

    public PlayList(String playListName) {
        this.playListName = playListName;
    }


    public void addItemPlayList(String songName){

        this.playListItems.add(PlayItemFactory.createItemPlayList(songName));

    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<ItemPlayList> getPlayListItems() {
        return playListItems;
    }

    public void setPlayListItems(List<ItemPlayList> playListItems) {
        this.playListItems = playListItems;
    }

    public String printPlayList(){
        String listStr = "\nPlayList > "+ this.playListName;
        for(ItemPlayList i: this.playListItems){
            listStr+="\n\t" + i.toString();
        }
        return listStr;
    }
}
