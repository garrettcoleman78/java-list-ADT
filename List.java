/**
 * Author: Garrett Coleman
 * Student No.: 96344598
 * Course: MSc Computer Science (Conversion) 2013-2014 
 * Module: COMP47160 Advanced Java, Data Structures & Algorithms
 * Lecturer: Rem Collier
 * Practical 9 
 * Date: 26 Feb 2014
 * This program creates a genericised interface called List that defines
 * the public method signatures that will be referenced by classes
 * that implement the List interface
 */

package W9;

public interface List<T> {
    public int size();
    public boolean isEmpty();
    public Position<T> first();
    public Position<T> last();
    public Position<T> prev(Position<T> p);
    public Position<T> next(Position<T> p);
    public Position<T> insertFirst(T e);
    public Position<T> insertLast(T e);
    public Position<T> insertBefore(Position<T> p, T e);
    public Position<T> insertAfter(Position<T> p, T e);
    public T replace(Position<T> p, T e);
    public T remove(Position<T> p);
}
