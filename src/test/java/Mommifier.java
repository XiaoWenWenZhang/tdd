import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mommifier {
    String regex="[aeiou]";

    public static final String MOMMY = "mommy";

    public String convert(String s) {
        if(s.length()==0) return s;
        float weight = weightOfVowels(s);
        if(weight<=0.3) return s;
        else return insertMommy(s,MOMMY);
    }

    private String insertMommy(String s, String mommy) {
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(String.valueOf(s.charAt(i)).matches(regex) && String.valueOf(s.charAt(i+1)).matches(regex)){
                stringBuilder.append(s.charAt(i)).append(MOMMY);
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        stringBuilder.append(s.charAt(s.length()-1));
        return stringBuilder.toString();
    }

    private float weightOfVowels(String s) {
        int count = 0;
        int len =s.length();
        System.out.println(len);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(s);
        while (matcher.find()){
            count++;
        }
        return (float)count/len;
    }


}
