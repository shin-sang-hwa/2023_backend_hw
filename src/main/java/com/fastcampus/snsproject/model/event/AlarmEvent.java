package com.fastcampus.snsproject.model.event;

import com.fastcampus.snsproject.model.AlarmArgs;
import com.fastcampus.snsproject.model.AlarmType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmEvent {
    private Integer receveUserId;
    private AlarmType alarmType;
    private AlarmArgs alarmArgs;
}
