package com.redhat.tracelisteners.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.redhat.tracelisteners.marshalling.LocalDateTimeDeserializer;
import com.redhat.tracelisteners.marshalling.LocalDateTimeSerializer;
import java.time.LocalDateTime;

@JsonPropertyOrder({"ID", "TimeStamp", "EventType"})
public class TraceEvent {

    private String ID;
    private LocalDateTime timestamp;
    private TraceEventType eventType = TraceEventType.None;

    @JsonProperty("ID")
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonProperty("TimeStamp")
    public LocalDateTime getTimeStamp() {
        return this.timestamp;
    }

    public void setTimeStamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("EventType")
    public TraceEventType getEventType() {
        return this.eventType;
    }

    public void setEventType(TraceEventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "TraceEvent{" +
            "ID='" + ID + '\'' +
            ", timestamp=" + timestamp +
            ", eventType=" + eventType +
            '}';
    }
}
