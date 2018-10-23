package com.br.credits;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.br.movie.Movie;
import com.br.actor.Actor;

@Entity
public class Credits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne  //many credits can include one actor // based off primary keys in the database.
	@JoinColumn(name = "actorID")	
	private Actor actor;
	
	@ManyToOne  //many purchase requests can be provided by one user // based off primary keys in the database.
	@JoinColumn(name = "movieID")	
	private Movie movie;

	//You do not define actorID or movieID, as it is defined above.
	private String CharacterName;


	public Credits() {
		super();
	}


	public Credits(int id, Actor actor, Movie movie, String actorID, String movieID, String characterName) {
		super();
		this.id = id;
		this.actor = actor;
		this.movie = movie;
		CharacterName = characterName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Actor getActor() {
		return actor;
	}


	public void setActor(Actor actor) {
		this.actor = actor;
	}


	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}



	public String getCharacterName() {
		return CharacterName;
	}


	public void setCharacterName(String characterName) {
		CharacterName = characterName;
	}
	
}
