package onedigitalinnovation.gof;

/**
 * 
 * Singleton Lazy holder"
 * @see <a href=" https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author GlailtonNascimento
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}