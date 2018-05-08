import part2.BubbleSort;
import part2.HeapSort;
import part4.Element;
import part4.StackElement;

import java.util.function.IntBinaryOperator;

/**
 * Created by wojciechpotocki on 24.04.2018.
 */
public class Main {
    public static void main(String args[]) {
        StackElement stackElement = new StackElement();
        stackElement.push(new Element(10));
        stackElement.push(new Element(20));
        stackElement.push(new Element(30));

        System.out.println("po dodaniu elementów: " +
                stackElement.size());

        Element popElement = stackElement.pop();

        System.out.println("wartość zdjętego elementu: " +
                popElement.getValue());

        System.out.println("po zdjęciu elementu: " +
                stackElement.size());

        Element peekElement = stackElement.peek();

        System.out.println("wartość zdjętego (peek) elementu: " +
                peekElement.getValue());

        System.out.println("po zdjęciu elementu: " +
                stackElement.size());

        stackElement.show();
    }
}
























