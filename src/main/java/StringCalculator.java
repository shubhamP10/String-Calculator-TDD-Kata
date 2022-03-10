public class StringCalculator {
    public int add(String numbers) {
        int result = 0;
        String delimiter = "";
        StringBuffer nums = new StringBuffer(numbers);

        if (numbers.startsWith("//")){
            delimiter = String.valueOf(numbers.charAt(2));
            numbers = nums.substring(3,nums.length());
        }

        String[] numbersArray = numbers.split(delimiter+"|,|\n");

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
