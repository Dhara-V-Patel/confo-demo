package com.pluralsight.confodemo.repositories;

import com.pluralsight.confodemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
