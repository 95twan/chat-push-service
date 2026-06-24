package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.AcceptInviteResponseRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AcceptInviteResponseRecordHandler implements BaseRecordHandler<AcceptInviteResponseRecord>{

    private static final Logger log = LoggerFactory.getLogger(AcceptInviteResponseRecordHandler.class);

    @Override
    public Class<AcceptInviteResponseRecord> recordType() {
        return AcceptInviteResponseRecord.class;
    }

    @Override
    public void handleRecord(AcceptInviteResponseRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
