package com.amydegregorio.activiti.repository;

import com.amydegregorio.activiti.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
