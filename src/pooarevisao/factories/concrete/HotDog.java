package pooarevisao.factories.concrete;

import pooarevisao.factories.LancheFactory;

public class HotDog implements LancheFactory {

	private HotDog() {}
	
	
	public LancheFactory getLanche() {
		return new hotDog();
	}

}
