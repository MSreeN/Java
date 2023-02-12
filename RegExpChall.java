public class RegExpChall {
    public static void main(String[] args) {
        // int i = 111010110;
        // String binary = String.valueOf(i);
        // if(binary.matches("[01]*")){
        //     System.out.println("String is in binary form");
        // }
        // // int j = 234AB;
        // String hexadecimal = "234AB";
        // System.out.println(hexadecimal.matches("[0-9A-F]*"));
        // String s = "25/1/2001";
        // System.out.println(s.matches("[0-9]*/[0-9]*/[0-9]*"));
        // ---------------------------------------------------------------
        String s = "a!b@c#1&2*3";
        System.out.println(s.replaceAll("[^a-zA-z0-9]",""));
        String spaces = "abs   d  tr  trt  t t tt   uii rewrew d";
        String newSpaces = spaces.replaceAll("\\s+"," ");
        String words[] = newSpaces.split("\\s");
        System.out.println(words.length);
    }
}
