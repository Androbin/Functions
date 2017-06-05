package de.androbin.function;

@ FunctionalInterface
public interface TriIntFunction<T> {
  T apply( int x, int y, int z );
}