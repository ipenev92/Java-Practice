public class DigitOperations {
    public static void main(String[] args) {
        // System.out.println(sumDigits(125));
        // System.out.println(isPalindrome(-222));
        // System.out.println(sumFirstAndLastDigit(101));
        // System.out.println(getGreatestCommonDivisor(10, 35));
        //System.out.println(isPerfectNumber(6));
        numberToWords(12300);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number > 10) {
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        } else {
            return -1;
        }
    }

    // Palindrome
    public static boolean isPalindrome (int number) {
        int lastDigit = 0;
        int rebmun = 0;
        int another_number = number;

        while (another_number != 0) {
            lastDigit = another_number % 10;
            rebmun *= 10;
            rebmun += lastDigit;
            another_number /= 10;

            if (number != rebmun) {
                continue;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = 0;
        int new_number = number;

        last = new_number % 10;

        while (new_number != 0) {
            first = new_number;
            new_number /= 10;
        }

        if (number >= 0) {
            return first + last;
        } else {
            return -1;
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int i = 0;
        if (first > second) {
            i = first;
        } else {
            i = second;
        }

        if (first > 10 && second > 10) {
            while (i > 0) {
                i--;
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            }
        } else {
            return -1;
        }
        return -1;
    }

    public static boolean isPerfectNumber(int number) {
        if (number >= 1) {
            int i = 1;
            int sum = 0;
            while (i < number) {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            }
            if (sum == number) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void numberToWords(int number) {
        int new_number = reverse(number);
        int digitCount = getDigitCount(number);

        if (number > 0) {
            while (digitCount > 0) {
                switch (new_number % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                digitCount--;
                new_number /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number > 0) {
            int numberCount = 0;
            while (number > 0) {
                numberCount++;
                number /= 10;
            }
            return numberCount;
        } else if (number == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
