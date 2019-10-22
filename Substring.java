import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestCommonSubstring {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        System.out.println("Enter the Strings, press 0 to exit");
        ArrayList<String> list=new ArrayList<>();
        String smallest=scanner.next();
        list.add(smallest);
        while(!quit) {
            String s = scanner.next();
            if (s.equals("0")) {
                quit = true;
            } else {
                list.add(s);
                if (s.length() < smallest.length()) {
                    smallest = s;
                    System.out.println(smallest);
                }
            }
        }

        String stem="";

        ArrayList<String> common=new ArrayList<>();

        for(int i=0;i<smallest.length();i++){
            for(int j=i+1;j<=smallest.length();j++){
                String subString=smallest.substring(i,j);
                boolean contains=true;
                for(int k=0;k<list.size();k++){
                    if(!list.get(k).contains(subString)){
                        contains=false;
                        break;
                    }
                }
                if(contains){
                    if(stem.length()<subString.length()){
                        stem=subString;
                        common.clear();
                        common.add(stem);
                    }else if(stem.length()==subString.length()){
                        common.add(subString);
                    }
                }
            }
        }

        Collections.sort(common);

        System.out.println(common.get(0));


    }
}
