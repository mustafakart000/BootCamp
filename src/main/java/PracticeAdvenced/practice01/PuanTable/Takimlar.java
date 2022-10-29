package PracticeAdvenced.practice01.PuanTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Takimlar {
int takimSayisi;
    static int sumPuan;

    public void takimlarSay(int takimSayisi) {
            this.takimSayisi = takimSayisi;

    }

    public void takimlar(){

        Scanner scanner = new Scanner(System.in);

        List<String> takimList = new ArrayList<>();
        while (takimSayisi!=takimList.size()) {
            for (int i=0; i<=takimSayisi;i++ ) {
                System.out.println("Takım adı giriniz: ");
                String takimListGet = scanner.nextLine();
                takimList.add(takimListGet);
                }
        }
    }

}
