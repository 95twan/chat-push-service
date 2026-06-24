package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.AcceptInviteNotificationRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AcceptInviteNotificationRecordHandler implements BaseRecordHandler<AcceptInviteNotificationRecord>{

    private static final Logger log = LoggerFactory.getLogger(AcceptInviteNotificationRecordHandler.class);

    @Override
    public Class<AcceptInviteNotificationRecord> recordType() {
        return AcceptInviteNotificationRecord.class;
    }

    @Override
    public void handleRecord(AcceptInviteNotificationRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
