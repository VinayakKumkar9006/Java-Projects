package test;

public sealed interface Itest permits ClassA,ClassB,ClassD {

	public abstract void dis(int k);
	
}
