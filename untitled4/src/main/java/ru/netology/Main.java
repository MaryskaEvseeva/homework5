package ru.netology;
import lombok.val;

public class Main {
    public static void main(String[]args){
        val item =new PurchaseItem(1, 1_000, 1);
        System.out.println(item);
    }
}