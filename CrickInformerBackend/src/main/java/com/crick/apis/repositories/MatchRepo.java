package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
    //custom finder method
    //query method

    //fetch the match - provide the team name
    Optional<Match> findByTeamHeading(String teamHeading);

}
