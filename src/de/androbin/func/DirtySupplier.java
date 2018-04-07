package de.androbin.func;

@FunctionalInterface
public interface DirtySupplier<T, E extends Exception> {
  T get() throws E;
}