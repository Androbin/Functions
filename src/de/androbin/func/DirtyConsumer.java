package de.androbin.func;

@ FunctionalInterface
public interface DirtyConsumer<T, E extends Exception> {
  void accept( T t ) throws E;
}