public class Morse {
    public static void morseParaPortugues(String[] codigo, String codigoMorse) {
        String[] array = codigoMorse.split(" ");
        System.out.print("Codigo Morse " + codigoMorse + " em português é ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < codigo.length; j++) {
                if (array[i].compareTo(codigo[j]) == 0) {
                    System.out.print((char) (j + 'a'));
                    break;
                }
            }
        }
    }
    public static void portuguesParaMorse(String[] codigo, String textoPortugues, char[] alfabeto) {
        System.out.print("Codigo Morse de " + textoPortugues + " é ");
        for (int i = 0; i < textoPortugues.length(); i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (textoPortugues.charAt(i) == alfabeto[j]) {
                    System.out.print(codigo[j] + " ");
                    break;
                }
            }
        }
    }

}
