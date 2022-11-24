/*Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/


import java.util.Scanner;
import java.time.LocalDateTime;

public class task1 {
   public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.println(LocalDateTime.now());   // получаем текущее время
      System.out.printf("Введите имя: ");      //Ввод имени с терминала
      String name = iScanner.nextLine();
      System.out.println(LocalDateTime.now().getHour());
      int hour = LocalDateTime.now().getHour();               // Вывод только часа
      if ((hour>=5) && (hour<12)){
         System.out.printf( "Доброе утро , %s!\n", name) ;

      }
      else if ((hour>=12) && (hour<18)){
         System.out.printf("Добрый день, %s!\n ", name);
      }

      else if ((hour>=18) && (hour<23)){
         System.out.printf("Доброй вечер, %s!\n", name);
      }

      else  {
         System.out.printf("Доброй ночи, %s!\n", name);
      }

      iScanner.close();
   }
}
   
