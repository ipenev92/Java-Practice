public class ForLoop {
    public static void main(String[] args) {
        //System.out.println(canPack(6, 0, 11));
        System.out.println(getLargetPrime(217));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (goal <= bigCount*5 + smallCount) {
                for (int i=bigCount; i>0; i--) {
                    if (goal >= 5) {
                        goal -= 5;
                    } else {
                        break;
                    }
                }

                return smallCount >= goal;
                }

        } else {
            return false;
        }
        return false;
    }
}
