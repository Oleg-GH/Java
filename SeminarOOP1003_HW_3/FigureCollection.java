package SeminarOOP1003_HW_3;

import java.util.ArrayList;
import java.util.Collections;

//import javax.xml.parsers.FactoryConfigurationError;

public class FigureCollection {

        private final ArrayList<Figure> figureCollection = new ArrayList<>();

        public ArrayList<Figure> getFigureCollection() {
            return figureCollection;
        } 

        public void addFigure(Figure figure) {
            this.figureCollection.add(figure);
        }    

        public void removeFigure(int i) {
            if (i < 0 || i >= figureCollection.size())
                System.out.println("Нет фигуры с указанным индексом!");
            else {
                System.out.printf(String.format("Старая фигура %s с индексом %d удалена из списка1!\n", 
                figureCollection.get(i).getClass().getSimpleName(), i));
                figureCollection.remove(i);
            }
        }

        public String getName(int i) {

            return figureCollection.get(i).getClass().getSimpleName();
        }


        public void set(int i, Figure figure){
            this.figureCollection.set(i, figure);
        }

        public void sortByArea(){
            Collections.sort(this.figureCollection);
        }   

        public void getAllFigureInfo () {
            for (Figure figure : figureCollection) {
                System.out.println(figure);
            // StringBuilder sb = new StringBuilder();           // этот способ даже больше нравится
            // for (int i = 0; i < figureCollection.size(); i++) // но он явно длиннее форича
            //     sb.append(getFigureInfo(i)).append("\n");
            // return sb.toString();
            }
        }

        // public String getFigureInfo(int i) {                  // метод был нужен, если использовать 
        //     if (i < 0 || i >= figureCollection.size())        // SrtringBuilder в предыдущем методе
        //         return "Нет фигуры с указанным индексом!";
        //     else {
        //         StringBuilder sb = new StringBuilder();
        //         sb.append(String.format(
        //             "Информация о фигуре %s с индексом %d:\nПериметр: %f см,\nПлощадь: %f кв.см. ",
        //             figureCollection.get(i).getClass().getSimpleName(), i,
        //             figureCollection.get(i).perimeter(),
        //             figureCollection.get(i).area()));
   
        //         return sb.toString();
        //     }
        // }
        
}
