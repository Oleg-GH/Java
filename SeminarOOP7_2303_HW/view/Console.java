package view;

import java.util.Scanner;
import presenter.Presenter;

public class Console implements IView{

    private Read read;
    private Scanner scanner;
    private String filePath = "notebook.txt";
    private boolean work = true;
    private Menu menu;
    private Presenter presenter;    
    
    public Console(){
        scanner = new Scanner(System.in);
        read = new Read();
        menu = new Menu(this);
    }

    Presenter getPresenter(){
        return presenter;
    }

    public void start(){
         while(work){
            System.out.println(menu.print()); 
            //String point = scanner.nextLine();   этот вариант был рабочим, но все равно
                                                // вызывал сообщение сообщение StackTrace
            try{                                // java.lang.NumberFormatException: For input string: ""
                int choice = inputNaturalNumber(scanner);    //Integer.parseInt(point);                
                menu.execute(choice);
            } catch(Exception e){
                System.out.println("Введите корректное значение.");
                e.printStackTrace();
                //continue;
            }            
         }         
    }

    public void createRecord(){
        System.out.println("Введите новую запись: ");
        String str = read.read().toString();
        getPresenter().createRecord(str);
    }

    public void readFile() {
        String str2 = getPresenter().readFile();
        System.out.println(str2);
    }

    public void removeLine(){
        System.out.println("Введите номер удаляемой строки: ");
        int number = inputNaturalNumber(scanner);   
        if (getPresenter().removeNote(filePath, number)) {
            System.out.printf("Строка %d удалена.\n", number);
        } else {
            System.out.println("Строки с таким номером не существует." +
            "Введите правильный номер строки.");
        }    
    }

    public void changeLine() {
        System.out.println("Введите номер изменяемой строки: ");
        int number = inputNaturalNumber(scanner);       //  => int number = scanner.nextInt();
        System.out.println("Введите новый текст, который заменит старый: ");
        String newLine = read.read().toString();        //readString.scan(); эта команда не работает почему-то
        
        if (getPresenter().changeLine(filePath, number, newLine)) {
            System.out.printf("Строка %d изменена.\n", number);
        } else {
            System.out.println("Строки с таким номером не существует." +
                                "Введите правильный номер строки.");
        }
    }

    public void finish(){
        System.out.println("\nРабота с блокнотом завершена.\n");
        work = false;
    }

    int inputNaturalNumber(Scanner scanner) {
        int number = 0;
        boolean checkNegative = false;

        while (!checkNegative) {

            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число, пожалуйста, повторите ввод!");
                scanner.next();
            }
            number = scanner.nextInt();

            if (number < 0)
                System.out.println("Вы ввели отрицательное число, пожалуйста, повторите ввод!");
            else
                checkNegative = true;
        }
        return number;
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

}

// Это был изначальный вариант
// public void setView(View view){
    //     this.view = view;
    // }

    // @Override
    // public StringBuilder scan() throws IOException {
    //     boolean start = true;
    //     StringBuilder str = new StringBuilder();
        
    //     while(start){
    //         //System.out.println("\nВводим только пункты меню!");
    //         System.out.println("\nВыберите пункт меню из указанных ниже:\n1. Внесите запись в блокнот\n" +
    //                            "2. Просмотреть весь блокнот\n3. Удалить запись по ее номеру\n" +
    //                            "4. Изменить запись по ее номеру\n5. Выход из блокнота.");
    //         int choice = inputNaturalNumber(scanner); //scanner.nextInt();
    //         if (choice == 1){
    //             System.out.println("Введите новую запись: ");
    //             str = read.read();
    //             view.startPresenter(str);
    //         }
            
    //         if (choice == 2){
    //             StringBuilder str2 = view.readFile();
    //             System.out.println(str2.toString());
    //         }

    //         if (choice == 3){
    //             System.out.println("Введите номер удаляемой строки: ");
    //             int number = inputNaturalNumber(scanner);   
    //             if (view.removeLine(filePath, number)) {
    //             System.out.printf("Строка %d удалена.\n", number);
    //             } else {
    //                 System.out.println("Строки с таким номером не существует." +
    //                 "Введите правильный номер строки.");
    //             }
    //         }

    //         if (choice == 4){
    //             System.out.println("Введите номер изменяемой строки: ");
    //             int number = inputNaturalNumber(scanner);       //  => int number = scanner.nextInt();
    //             System.out.println("Введите новый текст, который заменит старый: ");
    //             String newLine = read.read().toString();        //readString.scan(); эта команда не работает почему-то
                
    //             if (view.changeLine(filePath, number, newLine)) {
    //                 System.out.printf("Строка %d изменена.\n", number);
    //             } else {
    //                 System.out.println("Строки с таким номером не существует." +
    //                                    "Введите правильный номер строки.");
    //             }
    //         }
            
    //         if (choice == 5){
    //             System.out.println("\nРабота с блокнотом завершена.\n");
    //             start = false;
    //         } 
    //         continue;
            
    //     }
    //     return null;
    // }

