package com.ohgiraffers.service;

import com.ohgiraffers.common.MusicDTO;
import com.ohgiraffers.mapper.MusicMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MusicService {
    MusicMapper mapper;

    public List<MusicDTO> selectAllMusic() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        List<MusicDTO> musicList = mapper.selectAllMusic();


        return musicList;
    }
    public  List<MusicDTO> searchMusic(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        List<MusicDTO> musicList = mapper.searchMusic(criteria);
        return musicList;
    }

    public int registMusic(MusicDTO music) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        int result = mapper.registMusic(music);

        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        return result;
    }
}
