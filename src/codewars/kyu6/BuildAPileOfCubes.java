package codewars.kyu6;

public class BuildAPileOfCubes {

    public static void main(String[] args) {
        System.out.println(findNb(40539911473216L));
    }


    public static long findNb(long m) {
        long sum = 0;
        long iteration = 0;
        while (true){
            if (sum == m) {
                return iteration;
            } else if (sum < m) {
                iteration++;
                sum += cubeOfNumber(iteration);
            } else return -1;
        }
    }

    private static long cubeOfNumber(long number){
        return number*number*number;
    }
}
