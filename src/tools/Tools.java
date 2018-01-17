package tools;

import game.Koma;
import game.ShogiPiece;
import javafx.scene.image.Image;

import java.util.Objects;

public abstract class Tools {

    public static boolean isT2(int ordinal) {
        ordinal = Math.abs(ordinal);
        return ordinal == 1 || ordinal == 2 || ordinal == 7 || ordinal == 8;
    }

    public static boolean areClose(int row, int col, int row2, int col2) {
        return Math.abs(row - row2) <= 1 && Math.abs(col - col2) <= 1;
    }

    public static int getValue(int ordinal) {
        ordinal = Math.abs(ordinal);

        switch (ordinal) {
            case 1:                         //HISHA
                return 15;
            case 2:                         //KAKUGYO
                return 13;
            case 3:                         //GINSHO
                return 8;
            case 4:                         //KEIMA
                return 6;
            case 5:                         //KYOSHA
                return 5;
            case 6:                         //FUHYO
                return 2;
            case 7:                         //RYUO
                return 17;
            case 8:                         //RYUMA
                return 15;
            case 9:                         //KINSHO
                return 9;
            case 10:                        //NARIGIN
                return 9;
            case 11:                        //NARIKEI
                return 10;
            case 12:                        //NARIKYO
                return 10;
            case 13:                        //TOKIN
                return 12;
            case 14:                        //OSHO
                return 255_255_255;
            default:
                return 0;
        }

    }

    public static int getOrigin(int ordinal) {
        if (ordinal != 0)
            return Objects.requireNonNull(getPiece(ordinal)).getOriOrd() * (ordinal > 0 ? 1 : -1);
        else
            return 0;
    }

    public static Image getShogiImage(int ordinal) {

        return Objects.requireNonNull(getPiece(ordinal)).getImage();

    }


    public static ShogiPiece getPiece(int ordinal) {
        switch (Math.abs(ordinal)) {
            case 0:
                return null;
            case 1:
                return Koma.HISHA;
            case 2:
                return Koma.KAKUGYO;
            case 3:
                return Koma.GINSHO;
            case 4:
                return Koma.KEIMA;
            case 5:
                return Koma.KYOSHA;
            case 6:
                return Koma.FUHYO;
            case 7:
                return Koma.RYUO;
            case 8:
                return Koma.RYUMA;
            case 9:
                return Koma.KINSHO;
            case 10:
                return Koma.NARIGIN;
            case 11:
                return Koma.NARIKEI;
            case 12:
                return Koma.NARIKYO;
            case 13:
                return Koma.TOKIN;
            default:
                return Koma.OSHO;

        }
    }

}
