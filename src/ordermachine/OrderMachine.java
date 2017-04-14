package ordermachine;

public abstract class OrderMachine<T>{
	public abstract void order(T order);
	public abstract T output();
}
