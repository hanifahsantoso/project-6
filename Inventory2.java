package tugas6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventory2 {
    Scanner x = new Scanner(System.in);
    int all;

    int[] codeStuff = new int[50];
    int[] price = new int[50];
    int[] stock = new int[50];
    int[] value = new int[50];
    String[] name = new String[50];

    public void inData(){
        try {
            for (int i = 0; i < all; i++) {
                System.out.println("Produk nomor" + (i + 1));
                System.out.println("Nama produk \t\t tekan 0 jika tidak jadi : ");

                x.nextLine();
                codeStuff[i] = i + 1;
                name[i] = x.nextLine();

                if (name[i].equals("0")) {
                    break;
                }

                System.out.println("Harga produk : ");
                price[i] = x.nextInt();

                System.out.println("Stok produk : ");
                stock[i] = x.nextInt();
                price[i] = stock[i] * price[i];
            }
        }
        catch (InputMismatchException e){
            System.out.println("Nomor yang anda harus masukkan harus angka ");
            x.nextLine();
            menu();
        }
    }

    public void menu(){
        do{
            System.out.println("Masukkan nomor produk : ");
            all = x.nextInt();

            if(all <= 0){
                System.out.println("yang anda masukkan lebih dari 0");
            }
            else {
                inData();
            }
        }
        while(all <= 0);
    }

    public void getvaluedata(){
        for (int i = 0; i < all; i++){
            System.out.println("Nomor produk : "+codeStuff[i]);
            System.out.println("Nama produk : "+name[i]);
            System.out.println("Harga produk : "+price[i]);
            System.out.println("Stok produk : "+stock[i]);
            System.out.println("Nilai produk : "+value[i]);
        }
    }
}
