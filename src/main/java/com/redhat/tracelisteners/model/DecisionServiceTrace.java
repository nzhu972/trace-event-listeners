package com.redhat.tracelisteners.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@SuppressWarnings("FieldMayBeFinal")
@JsonPropertyOrder({"ID", "CorrelationID", "StartedOn", "CompletedOn", "AllRules", "RulesFired", "RulesNotFired", "TotalRuleCount", "RulesFiredCount",
    "RulesNotFiredCount", "ExecutionDuration"})
public class DecisionServiceTrace {

    private int totalRuleCount = 0;
    private int rulesFiredCount = 0;
    private int rulesNotFiredCount = 0;

    @JsonProperty("TotalRuleCount")
    public int getTotalRuleCount() {
        return this.totalRuleCount;
    }

    @JsonProperty("RulesFiredCount")
    public int getRulesFiredCount() {
        return this.rulesFiredCount;
    }

    @JsonProperty("RulesNotFiredCount")
    public int getRulesNotFiredCount() {
        return this.rulesNotFiredCount;
    }

    @Override
    public String toString() {
        return "DecisionServiceTrace{" +
            "totalRuleCount=" + totalRuleCount +
            ", rulesFiredCount=" + rulesFiredCount +
            ", rulesNotFiredCount=" + rulesNotFiredCount +
            '}';
    }
}