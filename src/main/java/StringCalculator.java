public class StringCalculator {
    public int add(String numbers) {
        int result = 0;
        String[] numbersArray = numbers.split(",");

        if (numbers.equals(""))
            return 0;
        else {
            for (String number : numbersArray) {
                result += Integer.parseInt(number);
            }
        }

        return result;
    }
}
