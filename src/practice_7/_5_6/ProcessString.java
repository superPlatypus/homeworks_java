package practice_7._5_6;

public class ProcessString implements StringFunctions{
    ProcessString() {}
    @Override
    public int countSymbols(String str) {
        return str.length();
    }
    @Override
    public String reverseSTR(String str) {
        StringBuilder newStr = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
    @Override
    public String modifySTR(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2){
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }
}
