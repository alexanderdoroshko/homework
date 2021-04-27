package hw_23042021;

public enum PathFile {
    PALINDROMEINPUT("D://tmp//palindrome.txt"),
    PALINDROMEOUTPUT("D://tmp//newpalindrome.txt"),
    TEXTFORMATERINPUT("D://tmp//someText.txt"),
    TEXTFORMATEROUTPUT("D://tmp//someTextCorrect.txt"),
    CENSORIN("D://tmp//censor.txt"),
    BLACKLIST("D://tmp//blacklist.txt");


    String path;

    PathFile(String path) {
        this.path = path;
    }
}
