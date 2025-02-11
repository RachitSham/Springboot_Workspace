package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DesielEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("DesielEngine :: Desiel Engine Started");
	}

	@Override
	public void stopEngine() {
		System.out.println("DesielEngine :: Desiel Engine Stopped");
	}

}
