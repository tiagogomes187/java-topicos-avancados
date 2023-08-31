package com.demo.saudacao;

import com.mod.hello.HelloWorld;
import com.mod.goodbye.GoodBye;

public class SaudacaoDemo {
	public static void main(String[] args) {

		HelloWorld helloWorld = new HelloWorld();
		helloWorld.diga();

		GoodBye goodBye = new GoodBye();
		goodBye.diga();

	}
}
