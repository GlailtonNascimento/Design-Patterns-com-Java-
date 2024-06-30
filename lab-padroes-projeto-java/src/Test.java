package onedigitalinnovation.gof;

import onedigitalinnovation.gof.SingletonEager;
import onedigitalinnovation.gof.SingletonLazy;
import onedigitalinnovation.gof.Strategy.Comportamento;
import onedigitalinnovation.gof.Strategy.ComportamentoAgressivo;
import onedigitalinnovation.gof.Strategy.ComportamentoDefinitivo;
import onedigitalinnovation.gof.Strategy.ComportamentoNormal;

public class Test {

	public static void main(String[] args) {
		
		//Teste relacionados ao Design Pattern Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
 
		// Strategy
		Comportamento defenviso = new ComportamentoDefinitivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defenviso);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		
	
	}

}
