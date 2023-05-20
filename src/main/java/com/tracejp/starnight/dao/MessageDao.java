package com.tracejp.starnight.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tracejp.starnight.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author traceJP
 * @since 2023-05-20 22:16:50
 */
@Mapper
public interface MessageDao extends BaseMapper<MessageEntity> {
	
}
