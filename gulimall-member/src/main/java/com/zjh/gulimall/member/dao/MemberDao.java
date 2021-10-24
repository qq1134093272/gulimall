package com.zjh.gulimall.member.dao;

import com.zjh.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 20:37:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
