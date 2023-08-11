package com.ohgiraffers.service;

import com.ohgiraffers.common.CategoryDTO;
import com.ohgiraffers.common.MusicDTO;
import com.ohgiraffers.mapper.MusicMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
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

    public List<MusicDTO> searchMusic(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        List<MusicDTO> musicList = mapper.searchMusic(criteria);
        return musicList;
    }

    public int registMusic(MusicDTO music) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        int result = mapper.registMusic(music);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result;
    }

    public int modifyMusic(MusicDTO music) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);
        int result = mapper.modifyMusic(music);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return result;
    }

    public int deleteMusic(int no) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);
        int result = mapper.deleteMusic(no);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return result;

    }

    public List<MusicDTO> randomMusic(HashMap<String, List<Integer>> randomList) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        List<MusicDTO> musicList = mapper.randomList(randomList);
        return musicList;


    }

    public List<CategoryDTO> MusicByCategoryCode(HashMap<String, Integer> categoryCode) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MusicMapper.class);

        List<CategoryDTO> list = mapper.MusicByCategory(categoryCode);

        return list;

    }
}
