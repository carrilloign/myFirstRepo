package com.exercise.morse.service;

import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class MorseToSp {

    public String toSp(String morse){
        Hashtable <String,String> translator = MorseToSp.translateToSp();
        String[] words = morse.split("   ");
        StringBuilder message= new StringBuilder();
        for(String word: words){
            String[] characters=word.split(" ");
            for (String character: characters){
                message.append(translator.get(character));
            }
            message.append(" ");
        }

        return message.toString();
    }

    public static Hashtable<String,String> translateToSp(){
        Hashtable<String, String> translator = new Hashtable<>();
        translator.put(".-", "A");
        translator.put("-...", "B");
        translator.put("-.-.", "C");
        translator.put("----", "CH");
        translator.put("-..", "D");
        translator.put(".", "E");
        translator.put("..-.", "F");
        translator.put("--.", "G");
        translator.put("....", "H");
        translator.put("..", "I");
        translator.put(".---", "J");
        translator.put("-.-", "K");
        translator.put(".-..", "L");
        translator.put("--", "M");
        translator.put("-.", "N");
        translator.put("--.--", "Ñ");
        translator.put("---", "O");
        translator.put(".--.", "P");
        translator.put("--.-", "Q");
        translator.put(".-.", "R");
        translator.put("...", "S");
        translator.put("-", "T");
        translator.put("..-", "U");
        translator.put("...-", "V");
        translator.put(".--", "W");
        translator.put("-..-", "X");
        translator.put("-.--", "Y");
        translator.put("--..", "Z");
        translator.put("-----", "0");
        translator.put(".----", "1");
        translator.put("..---", "2");
        translator.put("...--", "3");
        translator.put("....-", "4");
        translator.put(".....", "5");
        translator.put("-....", "6");
        translator.put("--...", "7");
        translator.put("---..", "8");
        translator.put("----.", "9");
        translator.put(".-.-.-", ".");
        translator.put("--..--", ",");
        translator.put("---...", ":");
        translator.put("..--..", "?");
        translator.put(".----.", "'");
        translator.put("-....-", "-");
        translator.put("-..-.", "/");
        translator.put(".-..-.", "\"");
        translator.put(".--.-.", "@");
        translator.put("-...-", "=");
        translator.put("−.−.−−", "!");

        return translator;
    }
}
