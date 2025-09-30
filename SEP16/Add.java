
public class Add {
    public static int sum(int start, int end){
        if(end>start){
            return end + sum(start, end -1);
        } else{
            return end;
        }
    }
    public static int sumloop(int start, int end){
        int sum = 0;
        while(end>=start){
            sum +=start;
            start++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = sum(5,10);
        System.out.println(result);
        int loopsum = sumloop(5, 10);
        System.out.println(loopsum);
    }

}
