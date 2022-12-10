import java.util.*;
public class Main {
    public static void main(String[] args) {
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0',' '};

        String[] codigo
                = {".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--..", "|","/"};

        String codigoMorse = ".--- --- --- / -.-. --- -. - .- / -.-. --- -- / .- / ... ..- .- / .- .--- ..- -.. .-";
        String textoPortugues = "poo";

        Morse.morseParaPortugues(codigo, codigoMorse);
        System.out.println();
        Morse.portuguesParaMorse(codigo, textoPortugues, alfabeto);
    }
}