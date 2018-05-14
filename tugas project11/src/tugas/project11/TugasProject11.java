/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.project11;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
public class TugasProject11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,kelas,hobi,nama_hobi;
        Scanner inputan = new Scanner(System.in);
        
        for(int i=1;i<=2;i++){
        System.out.print("nama : ");
        nama=inputan.nextLine();
        System.out.print("kelas : ");
        kelas=inputan.nextLine();
        System.out.print("hobi [bas/ban/mad] : ");
        hobi=inputan.nextLine();
        
        switch(hobi){
                 case "bas":
                     nama_hobi="basket";
                     break;
                 case "ban":
                     nama_hobi="band";
                     break;
                 case "mad":
                     nama_hobi="mading";
                     break;    
                 default:
                      nama_hobi="hobi tidak terdeteksi";
                     break;
        }
         System.out.println("terimakasih telah menginput"+nama+"kelas"+kelas+"dan hobi"+nama_hobi);
         System.out.println();
    }
    }
}
