public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

// 1) Donus degerini kullanmayin -> ne oluyor?
/* Java Derleyicisi genellikle bir hata vermez, ancak çoğu zaman bir derleyici uyarısı (compiler warning) verir.
* Derleyici, bir metot bir değer döndürmesine rağmen bu değeri bir değişkene atamazsanız bu durumun gereksiz olduğunu 
  belirten bir uyarı verebilir
*Bu, kural dışı bir durum değildir. Metot çalışır ancak ürettiği değer yok sayılır.
 */
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

/*Java Derleyicisi kesinlikle hata verir. void metotlar hiçbir değer döndürmez. Yani, bir ifade içinde kullanılamazlar.
*System.out.println("boo!") metodu void tipindedir. Bu, bu metodun bir sayı, bir metin veya herhangi bir veri tipi olmadığı 
anlamına gelir.

* + operatörü, iki değer  üzerinde işlem yapmak için tasarlanmıştır. void bir değer olmadığı için, Java void ile 7 sayısını 
  toplama girişimini bir tip uyumsuzluğu hatası olarak kabul eder ve kodun derlenmesini reddeder.  
*/

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
