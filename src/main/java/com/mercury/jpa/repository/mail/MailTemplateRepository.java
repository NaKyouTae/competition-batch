package com.mercury.jpa.repository.mail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercury.jpa.model.mail.MailTemplate;

@Repository
public interface MailTemplateRepository extends JpaRepository<MailTemplate, Long> {
	MailTemplate findByIdx(String idx);
	MailTemplate findByBatchId(String batch);
	List<MailTemplate> findByType(String type);
	List<MailTemplate> findByUsed(String use);
}
