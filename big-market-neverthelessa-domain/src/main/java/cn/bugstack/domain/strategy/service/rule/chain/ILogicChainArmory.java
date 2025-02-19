package cn.bugstack.domain.strategy.service.rule.chain;

/**
 * @author 24565
 * @date 2025/2/19 14:04
 * @description ILogicChainArmory
 */
public interface ILogicChainArmory {
    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);

}
