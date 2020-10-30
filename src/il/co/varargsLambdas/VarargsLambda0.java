package il.co.varargsLambdas;

@FunctionalInterface
public interface VarargsLambda0<T, R>
{
	@SuppressWarnings("unchecked")
	R take(T... args);
}
