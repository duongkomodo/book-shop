/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.fu.utillive;

/**
 *
 * @author ADMIN
 */
/* TA VIẾT CÁI CLASS ĐẺ CUNG CẤP CÁI TIỆN ÍCH CHO NƠI KHÁC XÀI
KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI , ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ
CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
*/
public class MathUtil {
    
    //n! = 1.2.3.4.5.6...n
    //Quy uoc: 0! = 1! = 1
    //Ko tinh giai thua cho so am
    //20! la vua khop kieu long, kieu long toi da 18 con so 0
    //21! lố kiểu long
    //nếu đưa vào là âm, 21 giai thừa, thì không tính và quăng exception
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument, n must be between 0 to 20");
        //hàm dừng
        
        //xuống đây là n = 0..20 rồi
        if(n == 0 || n == 1)
            return 1;
        
        //xuống đây là n = 2..20 rồi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi
       long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
        //product = product * i;
        // nhân từ 2 đến n
        return product;
    }
}
