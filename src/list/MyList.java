package list;

import java.util.Collections;

public interface MyList <T extends Comparable<T>> extends Iterable<T>{
    void addLast(T arg);
    default void addFirst(T arg){
        System.out.println("Такая реализация не предполагается!");
    }
    default void delete(int index){
        System.out.println("Реализация данного метода отсутствует!");
    };
    default void delete(T arg){
        System.out.println("Реализация данного метода отсутствует!");
    };
    T getElement(int index);
    int size();
}
