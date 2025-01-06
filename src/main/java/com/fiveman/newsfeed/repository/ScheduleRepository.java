package com.fiveman.newsfeed.repository;

import com.fiveman.newsfeed.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}