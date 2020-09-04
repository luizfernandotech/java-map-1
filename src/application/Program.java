package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "luiz.fernando.tech");
        cookies.put("email", "luiz.fernando.tech@gmail.com");
        cookies.put("phone", "999888777");

        cookies.remove("email");

        // treemap do no repeat keys, override previous phone
        cookies.put("phone", "666555444");

        System.out.println(String.format("Contains 'phone' key: %s", cookies.containsKey("phone")));
        System.out.println(String.format("Phone number: %s", cookies.get("phone")));

        // will return null
        System.out.println(String.format("Email: %s", cookies.get("email")));

        System.out.println(String.format("Size: %s", cookies.size()));

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(String.format("%s: %s", key, cookies.get(key)));
        }
    }
}
