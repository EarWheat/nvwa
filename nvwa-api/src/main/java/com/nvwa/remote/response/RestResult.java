package com.nvwa.remote.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.nvwa.remote.enums.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：liuzhaolu
 * @description：标准rest输出
 * @prd :
 * @date ：2022/1/11 4:38 下午
 * @Modification Date         Author          Description
 * ------------------------------------------ *
 * 2022/1/11 4:38 下午     liuzhaolu       firstVersion
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestResult<T> {

    /**
     * 错误码
     */
    @JSONField(name = "errno")
    private Integer errno;

    @JSONField(name = "errMsg")
    private String errMsg;

    @JSONField(name = "data")
    private T data;


    public static <T> RestResult<T> buildSuccess(T t){
        return (RestResult<T>) RestResult.builder()
                .errno(ResponseEnum.SUCCESS.getCode())
                .errMsg(ResponseEnum.SUCCESS.getMsg())
                .data(t)
                .build();
    }

    public static <T> RestResult<T> buildFail(T t){
        return (RestResult<T>) RestResult.builder()
                .errno(ResponseEnum.FAIL.getCode())
                .errMsg(ResponseEnum.FAIL.getMsg())
                .data(t)
                .build();
    }
}
