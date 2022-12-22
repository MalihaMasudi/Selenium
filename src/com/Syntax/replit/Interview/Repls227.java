package com.Syntax.replit.Interview;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Repls227 {
        /* HTML Elements
         Have the function HTMLElements (str) read the str parameter being passed which will be a string of HTML DOM elements and plain text. The elements that will be used are: b, i, em, div, p. For example:
         if str is < div>< b>< p>hello world< /p>< /b> < /div>
         then this string of DOM elements is nested correctly so your program should return the string true.
         If a string is not nested correctly, return the first element encountered where, if changed into a different element, would result in a properly formatted string. If the string is not formatted properly, then it will only be one element that needs to be changed. For example: if str is '< div> < i>hello< /i>world< /b>" then your program should return the string div because if the first < div> element were changed into a < b>, the string would be properly formatted.
         Examples
         Input: "< div>< div>< b>< /b>< /div>< /p>" Output: div
         Input: "< div>abc< /div>< p>< em>< i>test test test< /b>< /em>< /p>"
         Output: i*/
        public static void main(String[] args) {
            System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
            System.out.println(HTMLElements("<div><div><b></b></div></p>"));
            System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
        }
        public static String HTMLElements(String str){
            LinkedList<String> open = new LinkedList<>();
            List<String> openTags = Arrays.asList("b", "i", "em", "div", "p");
            List<String> closeTags = Arrays.asList("/b", "/i", "/em", "/div", "/p");

            String[] splits = str.split("[><]");

            for (int i = 0; i < splits.length; i++) {
                if (openTags.contains(splits[i])) {
                    open.add(splits[i]);
                }
                if (closeTags.contains(splits[i])) {
                    if (open.size() != 0) {
                        if (open.getLast().equals(splits[i].substring(1))) {
                            open.removeLast();
                        } else {
                            return open.getLast();
                        }}}}
            return "true";
        }
    }







