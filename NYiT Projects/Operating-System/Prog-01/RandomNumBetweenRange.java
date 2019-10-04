public class RandomNumBetweenRange {

    public double getRandomNumber(int min, int max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }

}
