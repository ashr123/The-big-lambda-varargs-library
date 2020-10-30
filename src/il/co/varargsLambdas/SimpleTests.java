package il.co.varargsLambdas;

import java.util.Arrays;

public class SimpleTests
{
	public static void main(String[] args)
	{
		System.out.println(((VarargsLambda0<Integer, String>) Arrays::toString).take(1, 2, 3));
		System.out.println(((VarargsLambda1<Integer, Integer, String>) (arg, integers) -> Arrays.toString(integers)).take(1, 2, 3));
	}
}
