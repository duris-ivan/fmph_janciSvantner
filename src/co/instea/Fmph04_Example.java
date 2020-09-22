package co.instea;

public class Fmph04_Example {

    public int pocetSlov(String veta){
        int i = -1, pocet = 0;
        veta = veta.trim(); // vymaze zaciatocne a koncove medzery
        do {
            i = veta.indexOf(" ", i+1);
            if (i>=0){
                pocet++;
            }
        }while (i>=0);
        return pocet+1;
    }

    public String vymazDiakritiku(String s){
        // pismena s diakritikou
        String[] pd = {"ď","ľ","š","č","ť","ž","ý","á","í","é","ú","ä","ň","ĺ","ŕ",
                "ô","ó","Ď","Ľ","Š","Č","Ť","Ž","Ý","Á","Í","É","Ú","Ň","Ó","Ŕ","Ĺ"};
        // pismena bez diakritky zodpovedajuce pismenam v poli pd
        String[] p = {"d","l","s","c","t","z","y","a","i","e","u","a","n","l","r",
                "o","o","D","L","S","C","T","Z","Y","A","I","E","U","N","O","R","L"};

        String vysledok = s;
        // prejdeme celym polom pd a nahradime vsetky vyskyty pismen
        // s diakritikou pismenami bez diakritiky
        for (int i=0;i<pd.length;i++){
            vysledok = vysledok.replaceAll(pd[i], p[i]);
        }
        return vysledok;
    }
}
