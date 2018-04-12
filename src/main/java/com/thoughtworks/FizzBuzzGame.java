package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private Integer fizz;
    private Integer buzz;
    private Integer whizz;

    public FizzBuzzGame() {
        fizz = 3;
        buzz = 5;
        whizz = 7;
    }

    public boolean setNumber(Integer fizz, Integer buzz, Integer whizz) {
        if (fizz <= 0 || fizz > 9) {
            return false;
        }
        if (buzz <= 0 || buzz > 9) {
            return false;
        }
        if (whizz <= 0 || whizz > 9) {
            return false;
        }
        if (fizz.equals(buzz) || fizz.equals(whizz) || buzz.equals(whizz)) {
            return false;
        }
        this.fizz = fizz;
        this.buzz = buzz;
        this.whizz = whizz;
        return true;
    }

    public void start(int count) {

    }

    public List<String> getResults() {
        return results;
    }

    String getAnswer(int i) {
        StringBuilder result = new StringBuilder();
        int n = i;
        while (n != 0) {
            if (n % 10 == fizz) {
                return result.append("Fizz").toString();
            } else {
                n = (n - n % 10) / 10;
            }
        }
        result.append(i % fizz == 0 ? "Fizz" : "");
        result.append(i % buzz == 0 ? "Buzz" : "");
        result.append(i % whizz == 0 ? "Whizz" : "");
        return result.toString();
    }
}


