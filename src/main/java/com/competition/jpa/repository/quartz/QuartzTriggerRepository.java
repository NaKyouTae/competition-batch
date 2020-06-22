package com.competition.jpa.repository.quartz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.competition.jpa.model.quartz.CustomTrigger;

@Repository
public interface QuartzTriggerRepository extends JpaRepository<CustomTrigger, Long> {
	CustomTrigger findByJobTitle(String jobkey);
	CustomTrigger findByTitle(String key);
	CustomTrigger findByIdx(String idx);
}
