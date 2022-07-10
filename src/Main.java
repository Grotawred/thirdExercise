import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String Line = "зараз корок ротатор дід ок";
        String[] arr = new String[20];
        String[] reverseArray = new String[20];
        String[] words = Line.split(" ");
        for ( String ignored : words ) {
            arr = words;
        }
        for(int i = 0; i< arr.length;i++){
            String reversedString = new StringBuffer(arr[i]).reverse().toString();
            boolean bool = true;
            while (bool) {
                if (Objects.equals(arr[i], reversedString)) {
                    reverseArray[i] = reversedString;
                    break;
                }
                bool = false;
            }
        }
        int i = 0;
        int min = i;
        for(int j = i;j< reverseArray.length;j++){
            if(reverseArray[min].length()<reverseArray[j].length()) {
                min = j;
            }
        }
        System.out.println(reverseArray[min]);
    }
}
