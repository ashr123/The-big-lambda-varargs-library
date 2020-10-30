package il.co.varargsLambdas;

@FunctionalInterface
public interface VarargsLambda1<T0, T1, R>
{
	@SuppressWarnings("unchecked")
	R take(T0 arg1, T1... args);
}
