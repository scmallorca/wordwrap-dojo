package org.mallorcasc.wordwrapkata;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Wrapper {

    public static String wrap(String txt, int col) {

        if (txt == null || txt.length() == col) {
            return txt;
        }
        return StringUtils.join(split(txt, col), "\n").trim();
    }

    private static List<String> split(String txt, int col) {

        List<String> splitted = new ArrayList<>();
        while (txt.length() > col) {
            int pos = cutAtPosition(txt, col);
            String substring = txt.substring(0, pos).trim();
            splitted.add(substring);
            txt = txt.substring(pos).trim();
        }
        if (txt.length() > 0) {
            splitted.add(txt.trim());
        }
        return splitted;
    }

    private static int cutAtPosition(String txt, int col) {

        int pos = txt.lastIndexOf(' ');
        if (pos == -1) {
            return col;
        }
        if (pos > col) {
            return cutAtPosition(txt.substring(0, pos), col);
        }
        return pos;
    }
}
