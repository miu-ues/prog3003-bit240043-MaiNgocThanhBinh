/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter03;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
public class bai3 {
    
    public static void main(String[] args) {

        CompletableFuture
                .supplyAsync(() -> {
                    // B1: cung cấp array bất đồng bộ
                    return Arrays.asList(1, 2, 5, 3, 100);
                })
                .thenApply(list -> {
                    // B2: lọc số lẻ + sắp xếp tăng
                    return list.stream()
                            .filter(n -> n % 2 != 0)
                            .sorted()
                            .collect(Collectors.toList());
                })
                .thenApply(result -> {
                    // B3: chuyển thành chuỗi
                    return "Kết quả là: " + result;
                })
                .thenAccept(System.out::println) // B4: in ra màn hình
                .join(); // chờ hoàn thành
    }
    
}
