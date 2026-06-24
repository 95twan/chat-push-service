package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.DisconnectResponseRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DisconnectResponseRecordHandler implements BaseRecordHandler<DisconnectResponseRecord> {

    private static final Logger log = LoggerFactory.getLogger(DisconnectResponseRecordHandler.class);

    @Override
    public Class<DisconnectResponseRecord> recordType() {
        return DisconnectResponseRecord.class;
    }

    @Override
    public void handleRecord(DisconnectResponseRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
