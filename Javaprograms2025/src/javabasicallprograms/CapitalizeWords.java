package javabasicallprograms;

public class CapitalizeWords {

	public static void main(String[] args) {
        String input = "my name is pradeep"; // Given input string
        String[] words = input.split(" "); // Split words
        String result = "";

        for (String word : words) {
            result =result+ word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }

        System.out.println("Output: " + result.trim());
    }
}