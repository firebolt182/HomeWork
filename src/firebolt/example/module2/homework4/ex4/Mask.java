package firebolt.example.module2.homework4.ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mask {
    public static String phoneMask(String phone) {
        String before = phone.substring(0, 4);
        String after = phone.substring(7);
        return before + "***" + after;
    }

    public static String mailMask(String mail) {
        Pattern pattern = Pattern.compile("\\w@\\w+");
        Matcher matcher = pattern.matcher(mail);
        String result = "";
        if (matcher.find()) {
            String replacement = mail.substring(matcher.start(), matcher.end());
            StringBuilder replace = new StringBuilder("*".repeat(replacement.length()));
            replace.setCharAt(1, '@');
            result = mail.replace(replacement, replace);
        }
        return result;
    }

    public static String nameMask(String name) {
        String[] nameArray = name.split(" ");
        String surname = nameArray[0];
        char firstLetter = surname.charAt(0);
        char lastLetter = surname.charAt(surname.length() - 1);
        StringBuilder replace = new StringBuilder("*".repeat(surname.length() - 1));
        replace.setCharAt(0, firstLetter);
        replace.append(lastLetter);
        String middleName = nameArray[2];
        middleName = middleName.charAt(0) + ".";
        return String.format("%s %s %s", replace, nameArray[1], middleName);
    }

    public static String textMask(String text) {
        //поиск эл. почты
        Pattern mailPattern = Pattern.compile("\\w+@\\w+.\\w*");
        Matcher mailMatcher = mailPattern.matcher(text);
        //поиск номера телефона
        Pattern phonePattern = Pattern.compile("7[\\d]*");
        Matcher phoneMatcher = phonePattern.matcher(text);
        //поиск ФИО
        Pattern namePattern = Pattern.compile("[A-Я][а-я]+ [A-Я][а-я]+ [A-Я][а-я]+");
        Matcher nameMatcher = namePattern.matcher(text);
        if (mailMatcher.find()) {
            String mail = text.substring(mailMatcher.start(), mailMatcher.end());
            text = text.replace(mail, mailMask(mail));
        }
        if (phoneMatcher.find()) {
            String phoneNumber = text.substring(phoneMatcher.start(), phoneMatcher.end());
            text = text.replace(phoneNumber, phoneMask(phoneNumber));
        }
        if (nameMatcher.find()) {
            String name = text.substring(nameMatcher.start(), nameMatcher.end());
            text = text.replace(name, nameMask(name));
        }
        return text;
    }
}