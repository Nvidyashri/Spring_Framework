package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KantarMovie {
	
	@Autowired
	private String language;
	@Autowired
	private String heroName;
	
	@Autowired
	private KantarMovieAutowired kantar;

	public String getLanguage() {
		return language;
	}

	public String getHeroName() {
		return heroName;
	}

	public KantarMovieAutowired getKantar() {
		return kantar;
	}
	
	public void displyKantarMovieAutowired() {
		System.out.println(kantar.getHeroenName());
		System.out.println(kantar.getHeroenOriginalName());
	}

}
