import java.util.Scanner;

public class Main {                                 //총 10분
    static public void main(String[] args) {
        Start s = new Start();
        s.main();
    }
}

class Start{

    Scanner s = new Scanner(System.in);

    String sentence;
    String search;
    String[] sentence_to_array;

    String change_to;

    public void main() {

        sentence = s.nextLine();
        
        System.out.println("찾는 문자를 검색하세요");
        search = s.nextLine();
        System.out.println("변경할 문자를 입력하세요");
        change_to = s.nextLine();

        sentence_to_array = sentence.split("");

        for(int i = 0; i < sentence.length(); i++) {  //5분

            if (search.contains(sentence_to_array[i])){
                sentence_to_array[i] = change_to;
            }
        }
        sentence = String.join("",sentence_to_array);
        System.out.println(sentence);
    }

}
