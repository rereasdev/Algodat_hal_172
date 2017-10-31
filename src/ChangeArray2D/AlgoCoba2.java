package ChangeArray2D;

public class AlgoCoba2 {

    public static void main(String[] args) {

        Object [][] country ={
            {"No","Name","Country"},    
            {"1.","David","Australia"}, 
            {"2.","Ahmad","Indonesia"}, 
            {"3.","Sudaish","Mesir"},   
            {"4.","Kim","Korea"}        
        };
        
        //menampilkan panjang array pertama kali
        System.out.println("Panjang awal array depan = "+country.length);
        System.out.println("Panjang awal array belakang = "+country[0].length);
        
        /* saya akan mengganti ukuran dari array yang diatas yg awal 
        ukurannya adalah [5][3] dan saya akan mengubahnya menjadi [6][4]*/
        
        Object[][] ganti = ChangeArray2DLength.changeLength2D(country, 6, 4);
        
        // menampilkan panjang array setelah di rubah
        System.out.println("Panjang array depan setelah di rubah =  "+ganti.length);
        System.out.println("Panjang array depan setelah di rubah =   "+ganti[0].length);
        
        // menampilkan isi array setelah di ganti ukurannya
        System.out.println("\nisi array setelah di rubah ukurannya ");
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
        }
    }
}
