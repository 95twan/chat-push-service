package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.JoinChannelNotificationRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JoinChannelNotificationRecordHandler implements BaseRecordHandler<JoinChannelNotificationRecord> {
    private static final Logger log = LoggerFactory.getLogger(JoinChannelNotificationRecordHandler.class);

    @Override
    public Class<JoinChannelNotificationRecord> recordType() {
        return JoinChannelNotificationRecord.class;
    }

    @Override
    public void handleRecord(JoinChannelNotificationRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
