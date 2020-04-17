/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author HIEULC
 */
public class MyToy {
    
    //class nay chua cac ham tien ich xai chung cho moi du an, moi noi
    //compute Factorical
    // trong do n >= 0, 0! = 1
    // n! bung no nhanh lam, cho nen minh xai long
    //danh cho CI/Cou
    public static long cF(int n){
        if (n < 0 || n > 15){
            throw new IllegalArgumentException("n must between 0....15");
        }
        if (n == 0)
            return 1;
        long product = 1; //bien tich luy, cong don
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    
    //thế thì việc làm bằng clean and build kết hợp với ant chạy bộ test đảm ảo xanh -> jar
    //có cách tự động vi diệu
    //Dev push code lên trên git server
    //Có ai đó theo dõi 
}
