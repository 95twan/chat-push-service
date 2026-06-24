package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.RejectInviteResponseRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RejectInviteResponseRecordHandler implements BaseRecordHandler<RejectInviteResponseRecord> {
    private static final Logger log = LoggerFactory.getLogger(RejectInviteResponseRecordHandler.class);

    @Override
    public Class<RejectInviteResponseRecord> recordType() {
        return RejectInviteResponseRecord.class;
    }

    @Override
    public void handleRecord(RejectInviteResponseRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
