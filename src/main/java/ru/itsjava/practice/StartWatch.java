package ru.itsjava.practice;

import java.util.ArrayList;
import java.util.List;

public class StartWatch {
    public static void main(String[] args) {
        Watch tisso = new Watch("TISSO","Dima",10000);
//        System.out.println("tisso.toString() = " + tisso.toString());
        List<Watch> watchList = new ArrayList<>();
        watchList.add(tisso);

        List<Watch> watchesOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega","Andrew",100_000);
        Watch romaOmega = new Watch("Omega","Roma",100_000);

        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romaOmega);
        System.out.println("watchesOmegaList = " + watchesOmegaList);

        watchList.addAll(watchesOmegaList);
        System.out.println("watchList = " + watchList);

        Watch dimaWatch = new Watch("Casio", "Dima",10_000);

        watchList.add(1,dimaWatch);

        System.out.println(watchList);

    }
}
