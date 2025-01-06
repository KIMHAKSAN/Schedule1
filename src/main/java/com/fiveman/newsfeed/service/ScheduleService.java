package com.fiveman.newsfeed.service;

import com.fiveman.newsfeed.domain.Schedule;
import com.fiveman.newsfeed.dto.ScheduleRequestDto;
import com.fiveman.newsfeed.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public Schedule createSchedule(ScheduleRequestDto requestDto) {
        Schedule schedule = new Schedule(
                requestDto.getTitle(),
                requestDto.getDescription(),
                requestDto.getStartTime(),
                requestDto.getEndTime()
        );
        return scheduleRepository.save(schedule);
    }

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}