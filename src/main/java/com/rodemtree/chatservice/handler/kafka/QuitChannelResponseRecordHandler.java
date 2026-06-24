package com.rodemtree.chatservice.handler.kafka;

import com.rodemtree.chatservice.dto.kafka.inbound.QuitChannelResponseRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class QuitChannelResponseRecordHandler implements BaseRecordHandler<QuitChannelResponseRecord> {
    private static final Logger log = LoggerFactory.getLogger(QuitChannelResponseRecordHandler.class);

    @Override
    public Class<QuitChannelResponseRecord> recordType() {
        return QuitChannelResponseRecord.class;
    }

    @Override
    public void handleRecord(QuitChannelResponseRecord record) {
        log.info("{} to offline userId: {}", record, record.userId());
    }
}
