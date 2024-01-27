//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Có thể xuất tất cả tập hợp cars dưới dạng 1 String
        System.out.println(cars);


        // Sort trong ArrayList: Sử dụng phương thức sort của Collections:
        Collections.sort(cars);  // Sort cars
        // Duyệt:
        for (String i : cars) {
            System.out.println(i);
        }

        // Lấy 1 phần tử
        cars.get(0);
        // Set giá trị
        cars.set(0, "Opel");
        // Remove:
        cars.remove(0);
        // Xóa hết
        cars.clear();
        // Xuất ra size
        cars.size();
    }
}