package de.androbin.func;

@ FunctionalInterface
public interface DirtyFunction<T, R, E extends Exception> {
  R apply( T t ) throws E;
}