package de.androbin.func;

@FunctionalInterface
public interface DirtyRunnable<T, E extends Exception> {
  void run() throws E;
}