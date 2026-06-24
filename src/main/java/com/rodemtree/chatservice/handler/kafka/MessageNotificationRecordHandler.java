package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.MessageNotificationRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageNotificationRecordHandler implements BaseRecordHandler<MessageNotificationRecord> {
    private static final Logger log = LoggerFactory.getLogger(MessageNotificationRecordHandler.class);

    @Override
    public Class<MessageNotificationRecord> recordType() {
        return MessageNotificationRecord.class;
    }

    @Override
    public void handleRecord(MessageNotificationRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
