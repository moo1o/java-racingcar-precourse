package utils;

public class NumberGenerator {
    private final static int MIN = 1;
    private final static int MAX = 10;
    /*
        0~9사이의 숫자 반환
     */
    public static int numberGenerate(){
        return (int)(Math.random()*(MAX - MIN + 1));
    }
}
