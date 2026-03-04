/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter04;
import java.util.concurrent.CompletableFuture;
public class bai4 {
    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(2000);
                        System.out.println("✔ Kiểm tra sản phẩm hoàn thành");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> payment =
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(3000);
                        System.out.println("✔ Thanh toán hoàn thành");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture<Void> shipping =
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(2500);
                        System.out.println("✔ Vận chuyển hoàn thành");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        CompletableFuture
                .allOf(checkProduct, payment, shipping)
                .thenRun(() -> System.out.println("🎉 Đơn hàng đã xử lý xong!"))
                .join();
    }

}
