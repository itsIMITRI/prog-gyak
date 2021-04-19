package hu.flowacademy;

public class Map {
    protected char[][] map;
    protected Turtle teki;


    public Map(int x, int y) {
        this.teki = new Turtle(x,y);
        this.map = new char[x][y];
        map[0][0] = '$';
    }
    public void drawMap(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j] != '$' && map[i][j] != '#'){
                    map[i][j] = '+';
                }
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public void doCommand(String command) {
        String movement = command.split(" ")[0];
        if (movement.equals("TOLLAT")) {
            teki.changePen(command);
        } else if (movement.equals("FEL") || movement.equals("LE") || movement.equals("BALRA") || movement.equals("JOBBRA")) {
            int moveCount = Integer.parseInt(command.split(" ")[1]);
            int pozX, pozY;
            for (int i = 0; i < moveCount; i++) {
                if (teki.usingPen) {
                    pozX = teki.pos_x;
                    pozY = teki.pos_y;
                    teki.move(movement);
                    map[pozX][pozY]= '#';
                    map[teki.pos_x][teki.pos_y]='$';
                }
                else{
                    pozX = teki.pos_x;
                    pozY = teki.pos_y;
                    teki.move(movement);
                    map[pozX][pozY]=' ';
                    map[teki.pos_x][teki.pos_y]='$';
                }
            }
        } else if (movement.equals("TOROL")) {
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map[i].length; j++){
                    if(map[i][j] == '#'){
                        map[i][j] = '+';
                    }
                    }
                }
            }
        }
    }



//Legyen egy doCommand függvénye, mely egy Stringet vár! Ez a String lesz az utasítás,
//amit a teknőcnek végre kell hajtania!
//Az utasítások a következők lehetnek:
//TOLLAT LE
//TOLLAT FEL
//LE x
//FEL x
//JOBBRA x
//BALRA x
//TÖRÖL
//x egy szám.
//A töröl utasítás kitörli a tömbből a # karaktereket, azaz, amit rajzolt a teknőc, de őt magát
//természetesen rajta hagyja a táblán.
//A doCommand függvény hajtsa végre a megfelelő utasítást! Segítség: ellenőrizd, hogy kell-e
//rajzolni, és ha igen, akkor minden lépésben mentsd el a teknőc koordinátáit a lépése előtt,
//hogy oda tehess egy '#' karaktert! Használj ciklust a lépések darabszáma miatt!

//1. Turtle osztály, mely a teknőcöt valósítja meg. Legyen két egész számot tároló adattagja a
//pozíciójára, továbbá egy logikai adattag, mely a toll állapotát reprezentálja, valamint a pálya
//méreteit is tárold le (két irányban)!


//2. Map osztály, mely egy két dimenziós char tömböt fog tárolni, és ez végzi a rajzolást.
//Tároljon továbbá egy Turtle objektumot is!
//- Készíts konstruktort, amely két számot vár, és ez alapján létrehozza a tömböt, továbbá
//példányosítja a Turtle objektumot a megfelelő adatokkal! A tömb 0,0 pozíciójára helyezd is el
//a '$' karaktert, ez lesz a teknőc!
//- Legyen egy drawMap függvénye, mely kirajzolja a konzolra a karaktertömböt!
//- Legyen egy doCommand függvénye, mely egy Stringet vár! Ez a String lesz az utasítás,
//amit a teknőcnek végre kell hajtania!