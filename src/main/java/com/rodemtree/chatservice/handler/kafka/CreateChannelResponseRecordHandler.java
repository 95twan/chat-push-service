package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.CreateChannelResponseRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CreateChannelResponseRecordHandler implements BaseRecordHandler<CreateChannelResponseRecord>{

    private static final Logger log = LoggerFactory.getLogger(CreateChannelResponseRecordHandler.class);

    @Override
    public Class<CreateChannelResponseRecord> recordType() {
        return CreateChannelResponseRecord.class;
    }

    @Override
    public void handleRecord(CreateChannelResponseRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }

}
