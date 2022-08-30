import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
    }
    private static void doTask1(){
        List<Integer> nums = generate(20);
        for (Integer num : nums){
            if (num % 2 == 1){
                System.out.println(num);
            }
        }
    }
    private static void doTask2(){
        List<Integer> nums = generate(20);
        Set<Integer> result = new TreeSet<>(nums);
        for (Integer num : result){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
    private static void doTask3(){
        List<String> words = List.of("test","test1","Test","test1234","test","test");
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
    }
    private static void doTask4(){
        List<String> words = List.of("test","test1","Test","test1234","test","test");
        Map<String , Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }

            }
    }
    private static List<Integer> generate(int n){
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            list.add(RANDOM.nextInt(0,5));
        }
        System.out.println("Сгенерированные числа: " + list);
        return list;
    }
}