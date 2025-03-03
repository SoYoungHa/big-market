package cn.bugstack.domain.strategy.model.entity;

import cn.bugstack.types.common.Constants;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 24565
 * @date 2025/2/17 22:17
 * @description 策略实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyEntity {
    /**抽奖策略ID*/
    private Long strategyId;
    /**抽奖策略描述*/
    private String strategyDesc;
    /** 抽奖规则模型*/
    private String ruleModels;

    public String[] ruleModels() {
        if (StringUtils.isBlank(ruleModels)) return null;
        return ruleModels.split(Constants.SPLIT);
    }

    // 获取权重规则
    // 步骤：1. 获取规则模型，2. 获取规则模型中的权重规则，3. 返回权重规则
    public String getRuleWeight() {
        String[] ruleModels = this.ruleModels();
        if (null == ruleModels) return null;
        for (String ruleModel : ruleModels) {
            if ("rule_weight".equals(ruleModel)) return ruleModel;
        }
        return null;
    }

}
