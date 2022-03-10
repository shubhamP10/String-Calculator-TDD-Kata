public class StringCalculator {
    public int add(String numbers) {
        int result = 0;

        if (numbers.equals(""))
            return 0;
        else {
            String delimiter = null;
            StringBuffer nums = new StringBuffer(numbers);

            if (numbers.startsWith("//")){
                delimiter = String.valueOf(numbers.charAt(2));
                numbers = nums.substring(3,nums.length());
            }

            String[] numbersArray = numbers.split(",|\\\n|"+delimiter);

            for (String number : numbersArray) {
                result += Integer.parseInt(number);
            }
        }

        return result;
    }
}
