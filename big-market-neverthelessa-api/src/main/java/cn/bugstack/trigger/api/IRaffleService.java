package cn.bugstack.trigger.api;

import cn.bugstack.trigger.api.dto.RaffleAwardListRequestDTO;
import cn.bugstack.trigger.api.dto.RaffleAwardListResponseDTO;
import cn.bugstack.trigger.api.dto.RaffleRequestDTO;
import cn.bugstack.trigger.api.dto.RaffleResponseDTO;
import cn.bugstack.types.model.Response;

import java.util.List;

/**
 * @author 24565
 * @date 2025/3/11 22:46
 * @description 抽奖接口
 */
public interface IRaffleService {
    /**
     * 策略装配接口
     * @param strategyId
     * @return 装配结果
     */
    Response<Boolean> strategyArmory(Long strategyId);

    /**
     * 查询抽奖奖品列表配置
     * @param requestDTO
     * @return 奖品列表数据
     */
    Response<List<RaffleAwardListResponseDTO>> queryRaffleAwardList(RaffleAwardListRequestDTO requestDTO);

    /**
     * 随机抽奖接口
     * @param requestDTO
     * @return
     */
    Response<RaffleResponseDTO > randomRaffle(RaffleRequestDTO requestDTO);
}
