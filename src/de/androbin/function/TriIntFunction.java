package de.androbin.function;

@ FunctionalInterface
public interface TriIntFunction<T>
{
	T apply( final int x, final int y, final int z );
}