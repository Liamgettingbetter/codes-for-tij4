package practice.datastructure.chapter1;

public class ex9 {

    static void removePunc(String temp) {
        StringBuilder sb = new StringBuilder();

        for(char a : temp.toCharArray()) {
            switch(a) {
                case '!' :
                case ',' :
                case '\'' :
                case '_' :
                case '.' : break;
                default :
                    sb.append(a);
            }
        }

        System.out.println(sb);
    }


    public static void main(String[] args) {
        removePunc("Let's do that!");
    }
}
