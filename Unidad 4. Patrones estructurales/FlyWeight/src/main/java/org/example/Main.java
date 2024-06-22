package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final String[] songNames = new String[10];
    private static final String[] playListNames = new String[5000];
    private static final List<PlayList> playLists = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Proceso de creacion de playlist iniciado\n" +
                           ", este proceso puede ser muy demorado por la gran cantidad de objetos que se crearan.\n" +
                           "Por favor  espere un momento, hasta que se le notifique qeu el proceso ha terminado" );


        //Imprime la memoria disponible para ala palicacion
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria disponible para la aplicacion: " + runtime.maxMemory()/1000000 );

        //desabilita el comportamiento flyweight
        PlayItemFactory.enableFlyWeight = true;
        initArrays();
        createRandomPlayList();
        System.out.println("Total PlayList: " + playLists.size());
        System.out.println("Total canciones creadas: " + PlayItemFactory.totalCreadas);
        System.out.println("Total canciones compartidas: " + PlayItemFactory.totalCompartidas);

        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria utilizada: " + (memoryUsed/1000000));


    }

    public static void initArrays(){
        for(int c=0; c<songNames.length;c++){
            songNames[c]="Song " + (c+1);
        }

        for(int c=0; c<playListNames.length;c++){
            playListNames[c]="PlayList " + (c+1);
        }

    }

    public static void createRandomPlayList(){

        Random random = new Random();

        for(int c=0; c<playListNames.length; c++){
            PlayList playList = new PlayList(playListNames[c]);
            for(int i=0;i<10;i++){
                int song = random.nextInt(songNames.length);
                playList.addItemPlayList(songNames[song]);
            }
            playLists.add(playList);
            double p=0;
            p=((c+1)/(double)playListNames.length)*100 ;
            if(p%25==0) {
               System.out.println("Completado " + p + "%");
               System.out.println("Listas creadas: " + playLists.size());
            }
        }

    }
}