package com.ohgiraffers.service;

import com.ohgiraffers.common.MusicDTO;
import com.ohgiraffers.mapper.MusicMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MusicService {
    MusicMapper mapper;

    public List<MusicDTO> selectAllMusic() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        List<MusicDTO> musicList = mapper.selectAllMusic();

        if (musicList != null){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        return musicList;
    }
}
