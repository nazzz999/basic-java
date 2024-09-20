import static java.lang.Math.*;
public class Start {
    public static void main(String[] args) {
        //Кодовое слово
        int num;
        //Исходные буквы для кодирования
        char A = 'А', B = 'ы';
        //Буквы после декодирования
        char X, Y;
        //Вычисление кода
        num = ((int)B<<16)+((int)A);
        //Вывод исходных данных и кода:
        System.out.println("Исходные буквы: \'" +A+"\' и \'" +B+ "\'.");
        System.out.println("Кодовое число: "+num);
        //Декодирование:
        Y = (char)(num>>>16);
        X = (char)(num^((int)Y<<16));
        //Вывод результата декодироания:
        System.out.println("Обратное преобразование: ");
        System.out.println("Буквы \'" +X+"\' и \'" +Y+ "\'.");


    }

}
