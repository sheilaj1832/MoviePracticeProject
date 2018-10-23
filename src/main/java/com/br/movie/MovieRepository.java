package com.br.movie;

import org.springframework.data.repository.CrudRepository;

import com.br.movie.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
